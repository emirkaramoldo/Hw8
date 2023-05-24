package kg.geeks.hw8.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT, name);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    setBlockedDamage(boss.getDamage() / 2);
    boss.setHealth(boss.getHealth() - this.getDamage() - this.blockedDamage);
    System.out.println("Berserk blocks and returns: "
            + (this.getDamage() + this.blockedDamage));
    }
}