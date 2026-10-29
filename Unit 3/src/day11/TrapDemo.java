package day11;

import java.util.Scanner;

/**
 * Day 11 live coding, part 2: next versus nextLine, and the nextLine trap.
 * Type 3 and press Enter for the first question.
 */
public class TrapDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many potions? ");
        int count = input.nextInt();

        // input.nextLine();   // uncomment this line to fix the trap

        System.out.print("Name your weapon: ");
        String weapon = input.nextLine();

        System.out.println("Potions: " + count);
        System.out.println("Weapon: [" + weapon + "]");

        System.out.print("Type two words: ");
        String first = input.next();
        String rest = input.nextLine();
        System.out.println("next() read [" + first + "]");
        System.out.println("nextLine() read [" + rest + "]");

        input.close();
    }
}
