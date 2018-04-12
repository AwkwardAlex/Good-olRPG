package Hero.Elf;

import Race.Elf;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Andrii Shulgin on 12.04.2018.
 */
public class Gunslinger extends Elf {

    @Getter
    @Setter
    private int health = 100;

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public void setRage(int rage) {
        super.setRage(rage);
    }

    @Override
    public void createHero() {
        Gunslinger gunslinger = new Gunslinger();
        gunslinger.setRage(10);
        gunslinger.setMana(90);
        System.out.println(gunslinger.getRage());
        System.out.println(gunslinger.getMana());
    }
}
