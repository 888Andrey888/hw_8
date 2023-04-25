package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.THOR);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setStun(RPG_Game.random.nextBoolean());
    }
}
