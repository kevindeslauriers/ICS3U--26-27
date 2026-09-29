package day7;
/**
 * A lantern from the text adventure game.
 * Burning uses 2 units of fuel per minute.
 */
public class Lantern {
    private int fuel;
    private boolean lit;
    /** Creates a lantern that is full (100 fuel) and not lit. */
    public Lantern() {
        fuel = 100;
        lit = false;
    }
    /** Creates a lantern with the given starting fuel, not lit. */
    public Lantern(int startingFuel) {
        fuel = startingFuel;
        lit = false;
    }
    /** Lights the lantern. */
    public void light() {
        lit = true;
    }
    /** Puts the lantern out. */
    public void extinguish() {
        lit = false;
    }
    /** Burns the lantern for the given number of minutes, using 2 fuel per minute. */
    public void burn(int minutes) {
        int used = minutes * 2;
        if (lit) {
            fuel = fuel - used;
        }
        if (fuel < 0) {
            fuel = 0;
        }
    }
    /** Adds fuel to the lantern. */
    public void refill(int amount) {
        fuel = fuel + amount;
    }
    /** Returns the fuel left in the lantern. */
    public int getFuel() {
        return fuel;
    }
    /** Returns whether the lantern is lit. */
    public boolean isLit() {
        return lit;
    }
    /** Returns the whole minutes of light left at 2 fuel per minute. */
    public int minutesLeft() {
        return fuel / 2;
    }
}

