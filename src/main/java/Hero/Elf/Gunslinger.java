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
        super.setMana(90);
    }

    @Override
    public void setRage(int rage) {
        super.setRage(10);
    }

    public static void print() {
        Gunslinger gunslinger = new Gunslinger();
        System.out.println(gunslinger.getCharisma());
        System.out.println(gunslinger.getMana());
        System.out.println(gunslinger.getConcentration());
        System.out.println(gunslinger.getRage());
    }
}
