package day8;

/**
 * Day 8, Part 3: Class methods (static) versus instance methods.
 */
public class StaticDriver {
    public static void main(String[] args) {

        // CLASS METHODS: called with the CLASS name. No object is created.
        GameMath.printBanner("Treasure Room");

        int gold = GameMath.totalGold(40, 2);
        System.out.println("Gold: " + gold);

        double avg2 = GameMath.average(7, 8);
        double avg3 = GameMath.average(7, 8, 10);
        System.out.println(avg2);
        System.out.println(avg3);

        // INSTANCE METHODS: called on an OBJECT (a reference variable).
        Lantern lamp = new Lantern();
        lamp.light();
        System.out.println(lamp.isLit());

        // ERROR 1: Remove the // from the next line. Hover over the red underline. Then put the // back.
        // Lantern.light();

        // ERROR 2: Remove the // from the next line. Hover over the red underline. Then put the // back.
        // int result = GameMath.printBanner("Oops");

        // ERROR 3: Remove the // from the next line. Hover over the red underline. Then put the // back.
        // double avg4 = GameMath.average(7, 8.5);
    }
}
