package hero.dwarf;

import race.Dwarf;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Mechanist extends Dwarf {

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
    public Mechanist createHero() {
        Mechanist mechanist = new Mechanist();
        mechanist.setRage(10);
        mechanist.setHealth(100);
        mechanist.setNameHero("Mechanist");
        mechanist.setMana((getAgility() + getCharisma() + getConcentration() + getIntellect() + getStamina()));
        System.out.println("Your hero is created. His name " + "\nname: " + mechanist.getNameHero() + "\nrace: " + mechanist.getNameRace() + "\nmana: " + mechanist.getMana() + "\nyour health: " + mechanist.getHealth());
        return mechanist;
    }

    @Override
    public void toGo() {

    }
}
