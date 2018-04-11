package AbstractRace;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class AbstractRace {

    private String name;
    private int Charisma;
    private int Stamina;
    private int Intellect;
    private int Agility;
    private int Concentration;
    private int rage;
    private int mana;

    public AbstractRace(String name, int charisma, int stamina, int intellect, int agility, int concentration) {
        this.name = name;
        Charisma = charisma;
        Stamina = stamina;
        Intellect = intellect;
        Agility = agility;
        Concentration = concentration;
    }
}
