package day16;

/**
 * An item in the text adventure game.
 * An item has a name, a description and a weight, and it can be takeable or not.
 */
public class Item {

    private String name;
    private String description;
    private int weight;
    private boolean takeable;

    /** Creates an item with the given name, an empty description, weight 0, and takeable. */
    public Item(String itemName) {
        name = itemName;
        description = "";
        weight = 0;
        takeable = true;
    }

    /** Returns the item's name. */
    public String getName() {
        return name;
    }

    /** Returns the item's description. */
    public String getDescription() {
        return description;
    }

    /** Returns the item's weight. */
    public int getWeight() {
        return weight;
    }

    /** Returns whether the player can pick up the item. */
    public boolean isTakeable() {
        return takeable;
    }

    /** Changes the item's description. */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /** Changes the item's weight. */
    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    /** Sets whether the player can pick up the item. */
    public void setTakeable(boolean canTake) {
        takeable = canTake;
    }
}
