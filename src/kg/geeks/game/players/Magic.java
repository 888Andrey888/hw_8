package kg.geeks.game.players;

public class Magic extends Hero {
    private int incr;

    public Magic(int health, int damage, String name, int incr) {

        super(health, damage, name, SuperAbility.BOOST);
        this.incr = incr;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i].getAbility() != SuperAbility.RESURRECTION){
                heroes[i].setDamage(heroes[i].getDamage() + incr);
            }
        }
    }
}
