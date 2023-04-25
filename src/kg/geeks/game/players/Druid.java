package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Druid extends Hero {
    private boolean isUsedAbility = false;
    private static boolean angel = false;
    private static boolean crow = false;

    private static int magnifierHealPoints = 10;

    public Druid(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CALL);
    }

    public static void setAngel(boolean angel) {
        Druid.angel = angel;
    }

    public static void setCrow(boolean crow) {
        Druid.crow = crow;
    }

    public static boolean isCrow() {
        return crow;
    }

    public static boolean isAngel() {
        return angel;
    }

    public static int getMagnifierHealPoints() {
        return magnifierHealPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (!isUsedAbility) {
            if (RPG_Game.random.nextBoolean()) {
                setAngel(true);
            } else {
                setCrow(true);
            }
        }
        isUsedAbility = true;
    }
}
