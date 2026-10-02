package day8;

/**
 * Day 8, Part 3: Shop Lab.
 * Write the code for each TODO directly under it.
 * Run after EVERY task and compare with the Expected comment.
 * Open Merchant.java and Player.java to read the constructors and method headers.
 */
public class ShopLab {
    public static void main(String[] args) {

        // TASK 1: Create a Merchant named "Greta" using the constructor with ONE parameter.
        //         Store it in a variable named greta.

        Merchant greta = new Merchant("Greta");


        // TASK 2: Create a Merchant named "Bram" who has 4 potions at 25 gold each.
        //         Store it in a variable named bram.
        Merchant bram = new Merchant("Bram", 4, 25);


        // TASK 3: Create a Player named "Ada" who starts with 100 gold.
        //         Store it in a variable named ada.
        Player ada = new Player("Ada", 100);


        // TASK 4: Print Greta's stock, then Greta's price, using her accessor methods.
        //         Expected: 10 then 15 (on two lines)


        // TASK 5: Store the cost of 3 potions from Bram in an int variable named cost. Print cost.
        //         Expected: 75


        // TASK 6: Ada buys those 3 potions. Ada spends cost, and Bram sells 3.
        //         Then print Ada's gold and Bram's stock.
        //         Expected: 25 then 1


        // TASK 7: Use the TWO parameter costOf to store the cost of 2 potions from Greta
        //         with a 5 gold discount in a variable named deal. Print deal.
        //         Expected: 25


        // TASK 8: In ONE statement, make Ada earn the cost of 4 potions from Greta.
        //         Hint: a method call that returns an int can be used as an argument.
        //         Then print Ada's gold.
        //         Expected: 85


        // TASK 9: Remove the // from the next two lines. Before you run, write your prediction
        //         for what bram.getStock() prints. Then add a line that prints it.
        Merchant shop = bram;
        shop.restock(10);


        // TASK 10: Each line below has ONE error. Remove the // from one line at a time,
        //          read the red error message, then fix the line so it compiles.
        // Merchant cora = new Merchant(8, "Cora", 12);
        // int left = greta.restock(5);
        // int price = greta.costOf(1.5);
    }
}
