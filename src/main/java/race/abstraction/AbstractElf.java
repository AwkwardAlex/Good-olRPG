package race.abstraction;

import race.abstraction.implement.AbstractRaceImpl;
import race.abstraction.implement.ManaImpl;

public abstract class AbstractElf extends AbstractRace implements AbstractRaceImpl, ManaImpl {

    public AbstractElf(String nameClass) {
        super("Elf", 15, 10, 25, 22, 18);
        this.nameClass = nameClass;
        calculateHealth(STARTING_HEALTH);
        calculateHealthRegen(STARTING_HEALTH_REGEN);
        calculateLevel(STARTING_LEVEL);
        calculateInitiative(STARTING_INITIATIVE);
        calculateBonusXPGain(STARTING_XP_GAIN);
        calculateDodgeChance(STARTING_DODGE_CHANCE);
        calculateMana(STARTING_MANA);
        calculateManaRegen(STARTING_MANA_REGEN);
    }
}
