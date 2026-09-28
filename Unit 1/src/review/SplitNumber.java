package review;

public class SplitNumber {
    public static void main(String[] args) {
        int x = 72831;

        int d1 = x % 10 / 1;
        int d2 = x % 100 / 10;
        int d3 = x % 1000 / 100;
        int d4 = x % 10000 / 1000;
        int d5 = x % 100000 / 10000;

        System.out.println(d1 + d2 + d3 + d4 + d5);
    }
}
