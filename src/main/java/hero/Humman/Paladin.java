package hero.Humman;

import race.Humman;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Paladin extends Humman {

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
    public Paladin createHero() {
        Paladin paladin = new Paladin();
        paladin.setRage(10);
        paladin.setHealth(100);
        paladin.setNameHero("Paladin");
        paladin.setMana((getAgility() + getCharisma() + getConcentration() + getIntellect() + getStamina()));
        System.out.println("Your hero is created. His name " + "\nname: " + paladin.getNameHero() + "\nrace: " + paladin.getNameRace() + "\nmana: " + paladin.getMana() + "\nyour health: " + paladin.getHealth());
        return paladin;
    }
}
