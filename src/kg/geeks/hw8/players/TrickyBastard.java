package kg.geeks.hw8.players;

import java.util.Random;

public class TrickyBastard extends Hero {
    private boolean beDead;

    public TrickyBastard(int health, int damage, String name) {
        super(health, damage, SuperAbility.BE_DEAD, name);
    }

    public void setBeDead(boolean beDead) {
        this.beDead = beDead;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        setBeDead(random.nextBoolean());
        if (beDead == true) {
            this.setDamage(0);
            this.setHealth(this.getHealth()+ boss.getDamage());
            System.out.println("Мёртв");
        }
        else {
            this.setDamage(4);
            System.out.println("Не мёртв");
        }
    }
}