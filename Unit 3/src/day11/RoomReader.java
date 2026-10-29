package day11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Day 11 live coding, part 3: reading a room from a text file.
 * cellar.txt is in the same folder as this file (src/day11).
 */
public class RoomReader {
    public static void main(String[] args) throws IOException {
        File roomFile = new File("src/day11/cellar.txt");
        Scanner fileIn = new Scanner(roomFile);

        String name = fileIn.nextLine();
        String description = fileIn.nextLine();
        int gold = fileIn.nextInt();
        boolean dark = fileIn.nextBoolean();

        System.out.println("== " + name + " ==");
        System.out.println(description);
        System.out.println("Gold on the floor: " + gold);
        System.out.println("Dark: " + dark);
        System.out.println("More to read: " + fileIn.hasNext());

        fileIn.close();
    }
}
