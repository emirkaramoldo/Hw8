package kg.geeks.hw8.players;

import kg.geeks.hw8.logic.RPG_Game;

public class Magic extends Hero {
    private int randomDamage;

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    public void setRandomDamage(int randomDamage) {
        this.randomDamage = randomDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setRandomDamage(RPG_Game.random.nextInt(15) + 2);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + this.randomDamage);
            }
        }
        System.out.println("Magic give: " + (this.randomDamage));
    }
}