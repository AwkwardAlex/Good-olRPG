package Hero.Dwarf;

import Race.Dwarf;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Warrior extends Dwarf {

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
    public Warrior createHero() {
        Warrior warrior = new Warrior();
        warrior.setRage(10);
        warrior.setHealth(100);
        warrior.setNameHero("Warrior");
        warrior.setMana((getAgility() + getCharisma() + getConcentration() + getIntellect() + getStamina()));
        System.out.println("Your hero is created. His name " + "\nname: " + warrior.getNameHero() + "\nrace: " + warrior.getNameRace() + "\nmana: " + warrior.getMana() + "\nyour health: " + warrior.getHealth());
        return warrior;
    }
}
