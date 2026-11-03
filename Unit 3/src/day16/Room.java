package day16;

import java.util.ArrayList;

/**
 * A room in the text adventure game.
 * A room has a name and a description, and it can be dark.
 * A room holds items and characters. Rooms are joined with the World class (see World.connect).
 */
public class Room {

    private String name;
    private String description;
    private boolean dark;
    private ArrayList<String> exitDirections;
    private ArrayList<Room> exitRooms;
    private ArrayList<Item> items;
    private ArrayList<NPC> characters;

    /** Creates a room with the given name, an empty description, not dark, and nothing in it. */
    public Room(String roomName) {
        name = roomName;
        description = "";
        dark = false;
        exitDirections = new ArrayList<String>();
        exitRooms = new ArrayList<Room>();
        items = new ArrayList<Item>();
        characters = new ArrayList<NPC>();
    }

    /** Creates a room with the given name and description, not dark, and nothing in it. */
    public Room(String roomName, String roomDescription) {
        this(roomName);
        description = roomDescription;
    }

    /** Returns the room's name. */
    public String getName() {
        return name;
    }

    /** Returns the room's description. */
    public String getDescription() {
        return description;
    }

    /** Returns whether the room is dark. A dark room needs a lantern to see in. */
    public boolean isDark() {
        return dark;
    }

    /** Changes the room's description. */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /** Sets whether the room is dark. */
    public void setDark(boolean isDark) {
        dark = isDark;
    }

    /** Puts the given item in the room. */
    public void addItem(Item item) {
        items.add(item);
    }

    /** Puts the given character in the room. */
    public void addNPC(NPC character) {
        characters.add(character);
    }

    /** Returns the number of items in the room. */
    public int itemCount() {
        return items.size();
    }

    /** Returns the number of characters in the room. */
    public int npcCount() {
        return characters.size();
    }

    // The methods below are used by World and Game. You do not need to call them.

    /** Adds a one way exit in the given direction to the given room. Use World.connect instead. */
    public void addExit(String direction, Room destination) {
        exitDirections.add(direction);
        exitRooms.add(destination);
    }

    /** Returns the room in the given direction, or null if there is no exit that way. */
    public Room getExit(String direction) {
        for (int i = 0; i < exitDirections.size(); i++) {
            if (exitDirections.get(i).equalsIgnoreCase(direction)) {
                return exitRooms.get(i);
            }
        }
        return null;
    }

    /** Returns the first item whose name contains the given word (any case), or null. */
    public Item findItem(String word) {
        for (Item item : items) {
            if (item.getName().toLowerCase().indexOf(word.toLowerCase()) >= 0) {
                return item;
            }
        }
        return null;
    }

    /** Removes the given item from the room. */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /** Returns the first character whose name contains the given word (any case), or null. */
    public NPC findNPC(String word) {
        for (NPC character : characters) {
            if (character.getName().toLowerCase().indexOf(word.toLowerCase()) >= 0) {
                return character;
            }
        }
        return null;
    }

    /** Returns what the player sees on entering the room. */
    public String describe(boolean canSee) {
        if (!canSee) {
            return name + "\nIt is pitch black. Something may be waiting in the dark.";
        }
        String text = name + "\n" + description;
        if (items.size() > 0) {
            text += "\nYou see: " + joinItems();
        }
        if (characters.size() > 0) {
            text += "\nAlso here: " + joinCharacters();
        }
        if (exitDirections.size() > 0) {
            text += "\nExits: " + String.join(", ", exitDirections);
        } else {
            text += "\nThere are no exits.";
        }
        return text;
    }

    private String joinItems() {
        String text = "";
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) {
                text += ", ";
            }
            text += items.get(i).getName();
        }
        return text;
    }

    private String joinCharacters() {
        String text = "";
        for (int i = 0; i < characters.size(); i++) {
            if (i > 0) {
                text += ", ";
            }
            text += characters.get(i).getName();
        }
        return text;
    }
}
