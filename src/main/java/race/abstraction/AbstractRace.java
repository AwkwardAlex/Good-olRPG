package race.abstraction;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class AbstractRace {

    private String nameRace;

    private String nameHero;

    private int charisma;

    private int stamina;

    private int intellect;

    private int agility;

    private int concentration;

    private int rage;

    private int mana;

    private int health;

    AbstractRace(String nameRace, String nameHero, int charisma, int stamina, int intellect, int agility, int concentration, int rage, int mana, int health) {
        this.nameRace = nameRace;
        this.nameHero = nameHero;
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
        this.rage = rage;
        this.mana = mana;
        this.health = health;
    }

    @Override
    public String toString() {
        return "race.abstraction{" + "nameRace='" + nameRace + '\'' + ", nameHero='" + nameHero + '\'' + '}';
    }
}
