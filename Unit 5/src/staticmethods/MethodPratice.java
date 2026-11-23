package staticmethods;

public class MethodPratice {
    public static void main(String[] args) {
        int x = healthAfter(30, 12);
        boolean y = canAfford(40, 15);
    }

    public static boolean canAfford(int i, int j) {
        
    }

    public static int healthAfter(int health, int damage) {
        health -= damage;
        if (health < 0)
            health = 0;

        return health;
    }
}
