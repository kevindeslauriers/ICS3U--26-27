package day12;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        // System.out.println(Integer.parseInt("1F", 16));
        // System.out.println(Integer.parseInt("1f", 16));

        // System.out.println(Integer.parseInt("1110111", 2));
        // System.out.println(Integer.parseInt("1123", 8));

        // System.out.println(Integer.parseInt("1123", 10));
        // System.out.println(Integer.parseInt("1123"));

        // System.out.println(Integer.toBinaryString(45));
        // System.out.println(Integer.toHexString(45));
        // System.out.println(Integer.toOctalString(45));

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the dial number (0 to 255): ");
        int dial = in.nextInt();
        in.nextLine();

        System.out.print("Enter the rune code in binary: ");
        String rune = in.nextLine();

        System.out.print("Enter the door word in hexadecimal: ");
        String door = in.nextLine();

        System.out.print("Enter the pass phrase: ");
        String phrase = in.nextLine();

        System.out.print("Dial in binary: " + Integer.toBinaryString(dial));
        System.out.print("Dial in hexadecimal: " + Integer.toHexString(dial));
        System.out.print("Dial in octal: " + Integer.toOctalString(dial));








        

    }
}
