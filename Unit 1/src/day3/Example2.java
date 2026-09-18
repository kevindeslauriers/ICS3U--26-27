package day3;

public class Example2 {
    public static void main(String[] args) {
        int num = 5381;

        int thousands = num / 1000;
        int hundreds = num / 10 % 10;
        int tens = num / 100 % 10;
        int ones = num % 10;

        int sum = thousands + hundreds + tens + ones;

        System.out.println(sum);
    }
}
