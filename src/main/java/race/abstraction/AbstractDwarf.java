package race.abstraction;

import race.abstraction.implement.AbstractRaceImpl;
import race.abstraction.implement.RageImpl;

public abstract class AbstractDwarf extends AbstractRace implements AbstractRaceImpl, RageImpl {

    public AbstractDwarf(String nameClass) {
        super("Dwarf", 5, 45, 15, 20, 5);
        this.nameClass = nameClass;
        calculateHealth(STARTING_HEALTH);
        calculateHealthRegen(STARTING_HEALTH_REGEN);
        calculateLevel(STARTING_LEVEL);
        calculateInitiative(STARTING_INITIATIVE);
        calculateBonusXPGain(STARTING_XP_GAIN);
        calculateDodgeChance(STARTING_DODGE_CHANCE);
        calculateRage(STARTING_RAGE);
        calculateRageRegen(STARTING_RAGE_REGEN);
    }
}