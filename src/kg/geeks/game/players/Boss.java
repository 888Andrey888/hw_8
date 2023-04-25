package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

import java.util.Random;

public class Boss extends GameEntity {
    private SuperAbility defence;
    private boolean stun = false;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }

    public void attack(Hero[] heroes) {
        if (!stun) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i] instanceof Avrora) {
                    if (((Avrora) heroes[i]).isInvis()) {
                        continue;
                    }
                }
                if (heroes[i].getHealth() > 0) {
                    heroes[i].setHealth(heroes[i].getHealth() - ((!Druid.isCrow() && this.getHealth() < (this.getHealth() / 2)) ?
                            this.getDamage() : (this.getDamage() + (this.getDamage() / 2))));
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BOSS " + super.toString() + " defence: " + this.defence + " state: " + ((this.stun) ? "stunned" : "in game") +
                "Pet:" + ((Druid.isCrow()) ? " Crow is colling" : " Crow is not colling") + "\n^^^^^^^^^^^^^^^^^";

    }
}
