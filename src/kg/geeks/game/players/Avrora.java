package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Avrora extends Hero {
    private boolean isUsedAbility = false;
    private boolean invis = false;
    private int countRoundInInvis = 0;

    public Avrora(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.INVISIBILITY);
    }

    public boolean isUsedAbility() {
        return isUsedAbility;
    }

    public void setCountRoundInInvis(int countRoundInInvis) {
        this.countRoundInInvis = this.countRoundInInvis + countRoundInInvis;
    }

    public int getCountRoundInInvis() {
        return countRoundInInvis;
    }

    public boolean isInvis() {
        return invis;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (!isUsedAbility && !invis){
            invis = RPG_Game.random.nextBoolean();
            if(invis) {
                isUsedAbility = true;
                System.out.println(this.getName() + " became invisible");
            }
        }
        if (invis && countRoundInInvis >=2){
            invis = false;
            System.out.println(this.getName() + " became visible");
        }
    }
}
