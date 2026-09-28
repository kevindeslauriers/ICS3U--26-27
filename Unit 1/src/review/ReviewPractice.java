package review;

public class ReviewPractice {
    public static void main(String[] args) {
        // int n = 11;

        // int num8s = n / 8;
        // n = n % 8;
        // int num4s = n / 4;
        // n = n % 4;

        // int num2s = n / 2;
        // n = n % 2;
        // System.out.print(num8s);
        // System.out.print(num4s);
        // System.out.print(num2s);
        // System.out.print(n);

        // int seconds = 4564654;

        // int hours = seconds / 3600;
        // seconds %= 3600;

        // int minutes = seconds / 60;
        // seconds %= 60;

        int cartonSize = 12;
        int eggs = 53;
        int cartons = (eggs + cartonSize - 1) / cartonSize;


        int eggsLeftOver = eggs % 12;

        cartons += eggsLeftOver + 12 / 12;

        int p = 454564;

        int q = p / 25;
        p = p % 25; // left over pennies

        int d = p / 10;
        p = p % 10; // left over pennies

        int n = p / 5;
        p = p % 5;  // left over pennies

        // int c = 287;

        // // int nickles = c / 5;
        // // System.out.println(nickles* 5);

        // int nickles = c / 5 * 5;

        Dog dog1 = new Dog();
        dog1.bark();
        


    }
}
