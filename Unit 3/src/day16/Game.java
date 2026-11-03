package day16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Plays the text adventure game in a world you have loaded.
 * Call it with the class name: Game.play(world, "Cellar");
 * Commands: look, go (direction), take (item), talk (character), inventory, quit
 */
public class Game {

    /** Plays the game, starting in the room with the given name, until the player types quit. */
    public static void play(World world, String startRoomName) {
        Room current = world.getRoom(startRoomName);
        if (current == null) {
            System.out.println("Game warning: no room named \"" + startRoomName + "\"");
            return;
        }
        ArrayList<Item> inventory = new ArrayList<Item>();
        Scanner input = new Scanner(System.in);

        System.out.println("Commands: look, go (direction), take (item), talk (character), inventory, quit");
        System.out.println();
        System.out.println(current.describe(canSee(current, inventory)));

        boolean playing = true;
        while (playing) {
            System.out.println();
            System.out.print("> ");
            String line = input.nextLine().trim().toLowerCase();
            String verb = line;
            String noun = "";
            int space = line.indexOf(" ");
            if (space >= 0) {
                verb = line.substring(0, space);
                noun = line.substring(space + 1).trim();
            }

            if (verb.equals("quit")) {
                playing = false;
            } else if (verb.equals("look")) {
                System.out.println(current.describe(canSee(current, inventory)));
            } else if (verb.equals("go")) {
                Room next = current.getExit(noun);
                if (next == null) {
                    System.out.println("You cannot go that way.");
                } else {
                    current = next;
                    System.out.println(current.describe(canSee(current, inventory)));
                }
            } else if (verb.equals("take")) {
                if (!canSee(current, inventory)) {
                    System.out.println("It is too dark to find anything.");
                } else {
                    Item item = current.findItem(noun);
                    if (item == null) {
                        System.out.println("There is no " + noun + " here.");
                    } else if (!item.isTakeable()) {
                        System.out.println("The " + item.getName() + " will not move.");
                    } else {
                        current.removeItem(item);
                        inventory.add(item);
                        System.out.println("Taken: " + item.getName() + ". " + item.getDescription());
                    }
                }
            } else if (verb.equals("talk")) {
                if (!canSee(current, inventory)) {
                    System.out.println("Something breathes in the dark, but you cannot see it.");
                } else {
                    NPC character = current.findNPC(noun);
                    if (character == null) {
                        System.out.println("No one by that name is here.");
                    } else {
                        System.out.println(character.getName() + ": \"" + character.talk() + "\"");
                    }
                }
            } else if (verb.equals("inventory") || verb.equals("i")) {
                if (inventory.size() == 0) {
                    System.out.println("You are carrying nothing.");
                } else {
                    int total = 0;
                    for (Item item : inventory) {
                        System.out.println("  " + item.getName() + " (weight " + item.getWeight() + ")");
                        total += item.getWeight();
                    }
                    System.out.println("Total weight: " + total);
                }
            } else {
                System.out.println("I do not understand that.");
            }
        }
        input.close();
        System.out.println("Thanks for playing.");
    }

    private static boolean canSee(Room room, ArrayList<Item> inventory) {
        if (!room.isDark()) {
            return true;
        }
        for (Item item : inventory) {
            if (item.getName().toLowerCase().indexOf("lantern") >= 0) {
                return true;
            }
        }
        return false;
    }
}
