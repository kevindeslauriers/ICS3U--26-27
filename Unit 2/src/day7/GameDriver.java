package day7;

public class GameDriver {
    public static void main(String[] args) {
        Lantern lamp = new Lantern();
        Lantern light = new Lantern(50);

        System.out.println(lamp.getFuel()); // called the method getFuel on tyhe lamp object
        System.out.println(light.getFuel());
        
        lamp.light();
        lamp.burn(10);          // burns the lamp for 10 minutes
        System.out.println(lamp.getFuel());

        Lantern lantern = light;

        System.out.println(light.getFuel());
        System.out.println(lantern.getFuel());
        light.light();

        System.out.println(light.isLit());
        System.out.println(lantern.isLit());




    }
}
