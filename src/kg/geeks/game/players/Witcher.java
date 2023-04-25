package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.RESURRECTION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0){
                heroes[i].setHealth(200);
                this.setHealth(0);
                break;
            }
        }
    }
}
