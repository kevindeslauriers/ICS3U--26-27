package day11;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File("src/day11/cellar.txt"));
        String name = fileIn.nextLine();
        fileIn.nextLine();
        int gold = fileIn.nextInt();
        System.out.println(name + " " + gold);
        System.out.println(fileIn.hasNext());

    }
}
