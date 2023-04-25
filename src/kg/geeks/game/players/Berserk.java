package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(20, 50);
        boss.setHealth(boss.getHealth() - (boss.getDamage() * coeff / 100));
        System.out.println("Berserk revert damage: " + (boss.getDamage() * coeff / 100));
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
}
