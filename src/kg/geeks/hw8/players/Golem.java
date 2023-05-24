package kg.geeks.hw8.players;

import java.util.Random;

public class Golem extends Hero {
    private int takeDamage;

    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.TAKE_DAMAGE, name);
    }

    public void setTakeDamage(int takeDamage) {
        this.takeDamage = takeDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int golemTakeDamage = boss.getDamage() / 5;
        int aliveHeroes = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] != this) {
                aliveHeroes ++;
                heroes[i].setHealth(heroes[i].getHealth() + golemTakeDamage);
            }
        }
        System.out.println(golemTakeDamage);
        this.setHealth(this.getHealth() - golemTakeDamage * aliveHeroes);
        System.out.println("Голем поглотил " + (boss.getDamage() + golemTakeDamage * aliveHeroes));
    }
}