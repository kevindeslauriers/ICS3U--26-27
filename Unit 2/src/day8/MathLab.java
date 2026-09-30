package day8;

/**
 * Day 8, Part 5: Math Lab.
 * Complete each TODO. Run after EVERY task and compare with the Expected comment.
 * Only use the Math methods from the AP Java Quick Reference:
 *   Math.abs(x)  Math.pow(base, exponent)  Math.sqrt(x)  Math.random()
 */
public class MathLab {
    public static void main(String[] args) {

        // TASK 1: Absolute value
        // The player is at position 11 on a path. The exit is at position 3.
        int player = 11;
        int exit = 3;
        // TODO: Store the number of steps between them (always positive) using Math.abs.
        int steps = 0;
        System.out.println("Steps to exit: " + steps);          // Expected: 8

        // TASK 2: Powers
        // A dragon's damage triples every level, so damage is 3 to the power of level.
        int level = 4;
        // TODO: Use Math.pow. Notice the type of the variable.
        double damage = 0;
        System.out.println("Dragon damage: " + damage);         // Expected: 81.0

        // TASK 3: Square root (distance on the game map)
        // Room A is at (1, 2). Room B is at (7, 10).
        int x1 = 1;
        int y1 = 2;
        int x2 = 7;
        int y2 = 10;
        // TODO: distance is the square root of (x2 - x1) squared plus (y2 - y1) squared.
        //       Use Math.sqrt and Math.pow in ONE expression.
        double distance = 0;
        System.out.println("Distance: " + distance);            // Expected: 10.0

        // TASK 4: Math.random()
        // TODO: Store the result of Math.random() in chance. Run the program 3 times.
        double chance = 0;
        System.out.println("Chance: " + chance);                // Expected: at least 0.0 and less than 1.0

        // TASK 5: Roll a six sided die (1 to 6, both included)
        // TODO: Use the pattern  (int) (Math.random() * range) + min
        int roll = 0;
        System.out.println("You rolled: " + roll);              // Expected: 1 to 6

        // TASK 6: Random treasure (50 to 100 gold, both included)
        // TODO: Work out range and min first. Careful: range is NOT 50.
        int treasure = 0;
        System.out.println("Treasure: " + treasure);            // Expected: 50 to 100

        // TASK 7: Find the bug
        // This line is supposed to roll a die from 1 to 6, but it prints 1 every single time.
        // Explain why in your submission, then fix it.
        int broken = (int) Math.random() * 6 + 1;
        System.out.println("Broken roll: " + broken);           // Expected after fix: 1 to 6

        // TASK 8 (CHALLENGE): Open GameMath.java and complete rollDie.
        // Then remove the // below and run the program 3 times.
        // System.out.println("d20 roll: " + GameMath.rollDie(20));   // Expected: 1 to 20
    }
}
