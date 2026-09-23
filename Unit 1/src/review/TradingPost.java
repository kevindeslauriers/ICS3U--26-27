package review;

public class TradingPost {
    public static void main(String[] args) {
        double lanternPrice = 9.99;
        int ropeCount = 3;
        double ropePrice = 1.10;

        double taxRate = 0.13;

        double subtotal = lanternPrice + ropeCount* ropePrice;

        System.out.println((int)(subtotal*100)/100.0);
    }
}
