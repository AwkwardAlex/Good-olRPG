package AbstractRace;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class AbstractRace {

    private String nameRace;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;
    private int rage;
    private int mana;

    AbstractRace(String nameRace, int charisma, int stamina, int intellect, int agility, int concentration, int rage, int mana) {
        this.nameRace = nameRace;
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
        this.rage = rage;
        this.mana = mana;
    }
}
