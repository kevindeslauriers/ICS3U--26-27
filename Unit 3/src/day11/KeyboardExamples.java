package day11;

import java.util.Scanner;

public class KeyboardExamples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.println(name + " is " + age + " years old.");

    }
}
