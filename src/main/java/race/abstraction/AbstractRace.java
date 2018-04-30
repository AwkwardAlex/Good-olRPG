package race.abstraction;

import lombok.Getter;
import lombok.Setter;

import static race.abstraction.implement.AbstractRaceImpl.MAX_LEVEL;
import static race.abstraction.implement.AbstractRaceImpl.STARTING_LEVEL;

@Getter
@Setter
public abstract class AbstractRace {

    public String nameClass;

    private String nameRace;

    private String nameHero;

    private int charisma;

    private int stamina;

    private int intellect;

    private int agility;

    private int concentration;

    private int rage;

    private double rageRegen;

    private int mana;

    private double manaRegen;

    private int health;

    private String heroName;

    private double healthRegen;

    private int initiativePoints;

    private double dodgeChance;

    private int level;

    private int experience;

    private int bonusExperienceGain;

    private boolean isLeader;

    private int nextLevel;

    AbstractRace(String nameHero, int charisma, int stamina, int intellect, int agility, int concentration) {
        this.nameHero = nameHero;
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
        this.nextLevel = 100;
        this.level = STARTING_LEVEL;
    }

    @Override
    public String toString() {
        return "race.abstraction{" + "nameRace='" + nameRace + '\'' + ", nameHero='" + nameHero + '\'' + '}';
    }

    public void calculateInitiative(int initiative) {
        this.initiativePoints = initiative + (charisma / 2);
    }

    public void calculateBonusXPGain(int bonusExperienceGain) {
        this.bonusExperienceGain = bonusExperienceGain + charisma;
    }

    public void calculateHealth(int health) {
        this.health = (health + (stamina * 2)) + concentration;
    }

    public void calculateHealthRegen(double healthRegen) {
        this.healthRegen = healthRegen + (stamina / 4);
    }

    public void calculateDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance + (agility / 2);
    }

    public void calculateLevel(int level) {
        this.level = +level;
    }

    public void calculateCharisma(int points) {
        this.charisma = charisma + points;
        calculateInitiative(this.initiativePoints);
        calculateBonusXPGain(this.bonusExperienceGain);
    }

    public void calculateStamina(int points) {
        this.stamina = stamina + points;
        calculateHealth(this.health);
        calculateHealthRegen(this.healthRegen);
    }

    public void calculateIntellect(int points) {
        this.intellect = intellect + points;
    }

    public void calculateAgility(int points) {
        this.agility = agility + points;
        calculateDodgeChance(this.dodgeChance);
    }

    public void calculateConcentration(int points) {
        this.concentration = concentration + points;
        calculateHealth(this.health);
    }

    public void calculateRage(int rage) {
        this.rage = rage + (agility * 4);
    }

    public void calculateRageRegen(double rageRegen) {
        this.rageRegen = rageRegen + concentration;
    }

    public void calculateMana(int mana) {
        this.mana = mana + intellect * 2;
    }

    public void calculateManaRegen(double manaRegen) {
        this.manaRegen = manaRegen + (intellect / 4) + (concentration * 1.5);
    }

    public void setLeader() {
        this.isLeader = true;
    }

    private int calculateExperience(int experience) {
        int result = 0;
        result += (int) ((isLeader ? experience * 0.4 : 0.3) * getBonusExperienceGain() / 100);
        return result;
    }

    public void levelUp(int sumExperience, int lvlSum) {
        this.experience += calculateExperience(sumExperience);
        if (this.experience >= nextLevel & level <= MAX_LEVEL) {
            level++;
            this.experience -= nextLevel;
            nextLevel = nextLevel * (100 - lvlSum) / 100 + nextLevel;
        }
    }
}


