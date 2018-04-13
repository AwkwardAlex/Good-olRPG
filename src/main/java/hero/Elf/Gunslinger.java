package hero.Elf;

import race.Elf;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Gunslinger extends Elf {

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
    public Gunslinger createHero() {
        Gunslinger gunslinger = new Gunslinger();
        gunslinger.setRage(10);
        gunslinger.setHealth(100);
        gunslinger.setNameHero("Gunslinger");
        gunslinger.setMana((getAgility() + getCharisma() + getConcentration() + getIntellect() + getStamina()));
        System.out.println("Your hero is created. His name " + "\nname: " + gunslinger.getNameHero() + "\nrace: " + gunslinger.getNameRace() + "\nmana: " + gunslinger.getMana() + "\nyour health: " + gunslinger.getHealth());
        return gunslinger;
    }
}
