package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(2, 4);
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Warrior hits critically: " +
                this.getDamage() * coeff);
    }
}
