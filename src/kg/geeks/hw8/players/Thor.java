package kg.geeks.hw8.players;

import java.util.Random;

public class Thor extends Hero {
    private boolean thorSlam;

    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.BASH, name);
    }

    public void setThorSlam(boolean thorSlam) {
        this.thorSlam = thorSlam;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        setThorSlam(random.nextBoolean());
//        if (thorSlam == true) {
//            boss.setDamage(0);
//            System.out.println("Thor slam the boss");
//        }
//        else {
//            boss.setDamage(50);
//            System.out.println("Thor missed");
//        }
    }
}