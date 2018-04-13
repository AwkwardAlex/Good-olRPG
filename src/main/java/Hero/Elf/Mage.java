package Hero.Elf;

import Race.Elf;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Mage extends Elf{

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
    public Mage createHero() {
        Mage mage = new Mage();
        mage.setRage(10);
        mage.setHealth(100);
        mage.setNameHero("mage");
        mage.setMana((getAgility()+getCharisma()+getConcentration()+getIntellect()+getStamina()));
        System.out.println("Your hero is created. His name "+"\nname: "+mage.getNameHero()+"\nrace: "+mage.getNameRace()+"\nmana: "+mage.getMana()+"\nyour health: "+mage.getHealth());
        return mage;
    }
    
}
