package day_4;

public class Example1 {
    public static void main(String[] args) {
        int mark1 = 76, mark2 = 89, mark3 = 68;
        int numMarks = 3;

        // create a double variable average and get the average and print to the screen
        // double average = (mark1 + mark2 + mark3) / (double)numMarks;
        double average = (double) ((mark1 + mark2 + mark3) / numMarks);

        // when you cast it is considered an explicit cast
        // (int) => (double) and (double) => (int)

        // when Java does it - it is an implicit cast
        // implicit cast from int to double is allowed.

        // int x = 7.6; // not allowed No implicit cast from double to int

        System.out.print("Average: ");
        System.out.println(average);
    }
}
