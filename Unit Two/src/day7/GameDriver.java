package day7;

public class GameDriver {
    public static void main(String[] args) {
        // Lantern lamp = new Lantern();                           // To create an object we call the CONSTRUCTOR
        // Lantern lightBulb = new Lantern(50);

        // lightBulb.light();

        // lightBulb.burn(10);
        // lightBulb.burn(5);
        // lightBulb.refill(30);
        // lightBulb.burn(5);

        // int fuelLeft = lightBulb.getFuel();

        // System.out.println(fuelLeft);

        // When we say new Lantern() we are calling the Lantern's constructor which create a new instance of the class.

        // the purpose of a constructor is to create a new instance of a class

        // lamp.light();
        // lightBulb.light();

        // System.out.println(lamp.isLit());
        // System.out.println(lightBulb.isLit());

        // lamp.extinguish();

        // System.out.println(lamp.isLit());
        // System.out.println(lightBulb.isLit());

        // lightBulb.burn(10);
        // System.out.println(lightBulb.getFuel());

        // System.out.println(lightBulb.burn(3));


        Lantern a = new Lantern();
        Lantern b = a;

        a.light();

        System.out.println(a.isLit());
        System.out.println(b.isLit());



        // Objects have state and behaviour
        // state define the current state of an object ie. how much fuel and whether it is lit - the attributes

        // behaviour define what an object can do - the public methods 

    }
}
