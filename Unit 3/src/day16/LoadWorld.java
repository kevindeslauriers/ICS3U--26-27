package day16;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Loads the game world from data files, then plays the game.
 * Read the documentation in Room, Item, NPC and World before you start.
 * Open each .txt file and work out its layout before you write code to read it.
 */
public class LoadWorld {

    public static void main(String[] args) throws IOException {
        World world = new World();

        // Part 1: rooms.txt
        // Each record is 3 lines: name, description, whether the room is dark.
        // The first room is done for you.
        Scanner roomFile = new Scanner(new File("src/day16/rooms.txt"));

        String name1 = roomFile.nextLine();
        String description1 = roomFile.nextLine();
        boolean dark1 = roomFile.nextBoolean();
        roomFile.nextLine();
        Room room1 = new Room(name1, description1);
        room1.setDark(dark1);
        world.addRoom(room1);

        // TODO: read the second and third rooms and add them to the world.

        roomFile.close();

        // Part 2: exits.txt
        // Each record is 1 line: from room, direction, to room.
        // TODO: read each exit and connect the rooms with world.connect.

        // Part 3: items.txt
        // TODO: work out the layout of a record, then read all three items.
        // Use the Item constructor and setter methods.
        // Put each item in its room: look the room up with world.getRoom, then call addItem.

        // Part 4: npcs.txt
        // TODO: work out the layout of a record, then read both characters.
        // Use the NPC constructor and addLine, then put each character in its room.

        // Part 5: crypt.txt (extension)
        // This file uses a different format. Each line is a key, an equals sign and a value.
        // TODO: read the Crypt room, add it to the world,
        // then connect it: down from the Chapel, up from the Crypt.

        System.out.println("Rooms loaded: " + world.roomCount());
        System.out.println();
        Game.play(world, "Cellar");
    }
}
