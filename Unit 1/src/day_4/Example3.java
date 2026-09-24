package day_4;

public class Example3 {
    public static void main(String[] args) {
        double costPerItem = 5.63;
        int numItems = 5;

        double taxRate = 0.13;

        double subTotal = costPerItem * numItems;
        double tax = subTotal * taxRate;

        double totalCost = subTotal + tax;

        double money = (int) (totalCost * 100 + 0.5) / 100.0;

        System.out.print("Total Cost: $");
        System.out.println(money);

    }
}
