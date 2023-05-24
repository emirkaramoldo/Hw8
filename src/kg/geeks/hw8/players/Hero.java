package kg.geeks.hw8.players;

public abstract class Hero extends kg.geeks.hw8.players.GameEntity
        implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void hit(kg.geeks.hw8.players.Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }
}
