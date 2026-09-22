package day4;

public class Example1 {
    public static void main(String[] args) {
        int mark1 = 76, mark2 = 84, mark3 = 99;
        int numMarks = 3;

        double average = (mark1 + mark2 + mark3) /  numMarks;
        // int x = 6.7;  // implicit cast from double to int is not allowed
        int j = (int) 6.7;
        double k = (double)5;
        double i = 6;




        System.out.println(average);


    }
}
