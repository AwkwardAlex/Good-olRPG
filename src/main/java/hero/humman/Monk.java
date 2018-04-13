package hero.humman;

import race.Humman;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Monk extends Humman {

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public void setRage(int rage) {
        super.setRage(rage);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public Monk createHero() {
        Monk monk = new Monk();
        monk.setRage(10);
        monk.setHealth(100);
        monk.setNameHero("Monk");
        monk.setMana((getAgility() + getCharisma() + getConcentration() + getIntellect() + getStamina()));
        System.out.println("Your hero is created. His name " + "\nname: " + monk.getNameHero() + "\nrace: " + monk.getNameRace() + "\nmana: " + monk.getMana() + "\nyour health: " + monk.getHealth());
        return monk;
    }
}
