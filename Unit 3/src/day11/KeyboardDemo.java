package day11;

import java.util.Scanner;

/**
 * Day 11 live coding, part 1: reading from the keyboard.
 * Press Run, then type your answers in the Terminal panel.
 */
public class KeyboardDemo {
    public static void main(String[] args) {
        // System is a class. in is a class variable of System.
        // System.in refers to the object connected to the keyboard.
        Scanner input = new Scanner(System.in);

        System.out.print("Name your hero: ");
        String name = input.nextLine();

        System.out.print("Starting gold: ");
        int gold = input.nextInt();

        Player hero = new Player(name, gold);
        System.out.println(hero.getName() + " enters the cellar with " + hero.getGold() + " gold.");

        input.close();
    }
}
