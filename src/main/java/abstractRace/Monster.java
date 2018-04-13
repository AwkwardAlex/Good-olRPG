package abstractRace;

public abstract class Monster extends AbstractRace {

    Monster(String nameRace, String nameHero, int charisma, int stamina, int intellect, int agility, int concentration, int rage, int mana, int health) {
        super(nameRace, nameHero, charisma, stamina, intellect, agility, concentration, rage, mana, health);
    }
}
