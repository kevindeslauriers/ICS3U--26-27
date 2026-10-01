package day8;

/**
 * A potion merchant in the text adventure game.
 */
public class Merchant {

    private String name;
    private int stock;
    private int price;

    /** Creates a merchant with the given name, 10 potions in stock, at 15 gold each. */
    public Merchant(String merchantName) {
        name = merchantName;
        stock = 10;
        price = 15;
    }

    /** Creates a merchant with the given name, starting stock and price per potion. */
    public Merchant(String merchantName, int startingStock, int potionPrice) {
        name = merchantName;
        stock = startingStock;
        price = potionPrice;
    }

    /** Returns the merchant's name. */
    public String getName() {
        return name;
    }

    /** Returns the number of potions in stock. */
    public int getStock() {
        return stock;
    }

    /** Returns the price of one potion in gold. */
    public int getPrice() {
        return price;
    }

    /** Returns the cost in gold of the given number of potions. */
    public int costOf(int quantity) {
        return quantity * price;
    }

    /** Returns the cost in gold of the given number of potions, minus a discount in gold. */
    public int costOf(int quantity, int discount) {
        return quantity * price - discount;
    }

    /** Removes the given number of potions from stock. */
    public void sell(int quantity) {
        stock = stock - quantity;
    }

    /** Adds the given number of potions to stock. */
    public void restock(int amount) {
        stock = stock + amount;
    }

    /** Changes the price of one potion. */
    public void setPrice(int newPrice) {
        price = newPrice;
    }
}
