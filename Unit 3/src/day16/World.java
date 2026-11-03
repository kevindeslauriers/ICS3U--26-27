package day16;

import java.util.ArrayList;

/**
 * The game world: every room in the text adventure game.
 * Add rooms to the world, then look them up by name and connect them.
 */
public class World {

    private ArrayList<Room> rooms;

    /** Creates a world with no rooms. */
    public World() {
        rooms = new ArrayList<Room>();
    }

    /** Adds the given room to the world. */
    public void addRoom(Room room) {
        rooms.add(room);
    }

    /** Returns the number of rooms in the world. */
    public int roomCount() {
        return rooms.size();
    }

    /**
     * Returns the room with exactly the given name (case sensitive),
     * or null if there is no room with that name.
     */
    public Room getRoom(String roomName) {
        for (Room room : rooms) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }

    /**
     * Adds a one way exit: from the room named fromName, going in the given direction,
     * leads to the room named toName. To go both ways, connect both directions.
     * Prints a warning and adds nothing if either room is not in the world.
     */
    public void connect(String fromName, String direction, String toName) {
        Room from = getRoom(fromName);
        Room to = getRoom(toName);
        if (from == null) {
            System.out.println("World warning: no room named \"" + fromName + "\"");
        } else if (to == null) {
            System.out.println("World warning: no room named \"" + toName + "\"");
        } else {
            from.addExit(direction, to);
        }
    }
}
