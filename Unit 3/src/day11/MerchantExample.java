package day11;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MerchantExample {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter merchant name: ");
        // String name = in.nextLine();

        // System.out.print("Enter merchant starting stock: ");
        // int stock = in.nextInt();

        // System.out.print("Enter potion price: ");
        // int price = in.nextInt();

        // Merchant borna = new Merchant(name, stock, price);

        Scanner in = new Scanner(new File("src/day11/jobinfo.txt"));

        System.out.print("Enter merchant name: ");
        String name = in.nextLine();

        System.out.print("Enter merchant starting stock: ");
        int stock = in.nextInt();

        System.out.print("Enter potion price: ");
        int price = in.nextInt();

        Merchant peter = new Merchant(name, stock, price);
        
        System.out.print("Enter merchant name: ");
        name = in.next();

        System.out.print("Enter merchant starting stock: ");
        stock = in.nextInt();

        System.out.print("Enter potion price: ");
        price = in.nextInt();

        Merchant jason = new Merchant(name, stock, price);

        

    }
}
