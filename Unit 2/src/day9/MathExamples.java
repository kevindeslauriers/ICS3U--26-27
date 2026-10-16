package day9;

public class MathExamples {
    public static void main(String[] args) {
        int num = -7;
        double x = -3.4;

        // System.out.println(Math.abs(num));
        // System.out.println(Math.abs(x));
        // System.out.println(Math.abs(-5.6));

        // System.out.println(Math.pow(8,3));
        // System.out.println(Math.pow(8, 1/3.0));

        // System.out.println(Math.sqrt(48));

        // int x1 = 3, y1 = 6;
        // int x2 = -4, y2 = 0;

        // double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        // System.out.println(d);

        // double slope = (double)(y2-y1)/(x2-x1);

        int upper = 10, lower = -10;


        // for (int i = 0; i < 1000; i++) {
        //     System.out.println((int)(Math.random() * (upper-lower+1)) + lower);            
        // }


        for (int i = 0; i < 100; i++) {
            System.out.println((int)(Math.random()*(upper-lower+1)) + lower);
        }


    }
}
