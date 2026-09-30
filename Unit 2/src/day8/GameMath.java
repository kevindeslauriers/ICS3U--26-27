package day8;

/**
 * A toolbox of class methods for the text adventure game.
 * Every method here is static, so you never create a GameMath object.
 * Call them with the class name: GameMath.methodName(arguments)
 */
public class GameMath {

    /** Returns the total value in gold of the given coins and gems. Each gem is worth 25 gold. */
    public static int totalGold(int coins, int gems) {
        return coins + gems * 25;
    }

    /** Returns the average of two scores. */
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    /** Returns the average of three scores. */
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    /** Prints a banner with the given title. */
    public static void printBanner(String title) {
        System.out.println("*** " + title + " ***");
    }

    /**
     * CHALLENGE (Task 8 in MathLab):
     * Returns a random roll of a die with the given number of sides,
     * from 1 to sides, both included.
     * Replace return 0; with the correct expression.
     */
    public static int rollDie(int sides) {
        return 0;
    }
}
