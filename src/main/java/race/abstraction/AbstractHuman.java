package race.abstraction;

import race.abstraction.implement.AbstractRaceImpl;
import race.abstraction.implement.ManaImpl;

public abstract class AbstractHuman extends AbstractRace implements AbstractRaceImpl, ManaImpl {

    public AbstractHuman(String nameClass) {
        super("Human", 10, 30, 20, 15, 15);
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