package review;

public class TestQuestion {
    public static void main(String[] args) {
        int total = 0;
        total += 88;
        total += 74;
        total += 95;
        double average = total / 3;
        double rounded = (int) (average) + (double) (average % 10 + 0.05);
        int whole = (int) (rounded + 0.5);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Rounded: " + rounded);
        System.out.println("Whole: " + whole);
    }
}
