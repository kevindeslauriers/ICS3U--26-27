package day7;
/**
 * A player in the text adventure game.
 */
public class Player {
    private String name;
    private int gold;
    /** Creates a player with the given name and 50 gold. */
    public Player(String startingName) {
        name = startingName;
        gold = 50;
    }
    /** Creates a player with the given name and the given gold. */
    public Player(String startingName, int startingGold) {
        name = startingName;
        gold = startingGold;
    }
    /** Returns the player's name. */
    public String getName() {
        return name;
    }
    /** Returns the player's gold. */
    public int getGold() {
        return gold;
    }
    /** Adds the given amount of gold. */
    public void earn(int amount) {
        gold = gold + amount;
    }
    /** Removes the given amount of gold, never going below 0. */
    public void spend(int amount) {
        gold = gold - amount;
        if (gold < 0) {
            gold = 0;
        }
    }
    /** Changes the player's name. */
    public void rename(String newName) {
        name = newName;
    }
}
