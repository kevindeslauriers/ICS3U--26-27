package day8;

/**
 * Day 8, Part 1: Review of objects (Sept 29).
 * Write your predictions for Lines 1 to 5 BEFORE you press Run.
 */
public class ReviewDriver {
    public static void main(String[] args) {
        Lantern a = new Lantern();
        Lantern b = new Lantern(40);
        Lantern c = a;

        a.light();
        b.light();
        c.burn(10);
        b.burn(5);

        System.out.println(a.getFuel());   // Line 1
        System.out.println(b.getFuel());   // Line 2
        System.out.println(c.isLit());     // Line 3

        c.extinguish();
        System.out.println(a.isLit());     // Line 4

        int x = 5;
        int y = x;
        y = y + 10;
        System.out.println(x);             // Line 5
    }
}
