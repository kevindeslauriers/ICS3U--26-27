package day3;

public class ExampleThree {
    public static void main(String[] args) {
        int number = 4719;  // find the sum of the individual digits
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100 % 10;       // 4719 / 100 => 47 % 10 => 7
        int thousands = number / 1000;

        int sum = ones + tens + hundreds + thousands;
        System.out.println(sum);
        
    }
}
