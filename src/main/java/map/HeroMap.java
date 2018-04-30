package map;

import hero.dwarf.Mechanist;
import hero.dwarf.Warrior;
import hero.elf.Gunslinger;
import hero.elf.Mage;
import hero.human.Monk;
import hero.human.Paladin;
import race.abstraction.AbstractRace;

import java.util.HashMap;
import java.util.Map;

public class HeroMap {

    private static Map<String, Map<String, AbstractRace>> races;

    private static Map<String, Map<String, AbstractRace>> getRace() {
        if (races == null) {
            races = initRaceMap();
        }
        return races;
    }

    private static Map<String, AbstractRace> getElfHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Mage());
        raceHeroes.put("2", new Gunslinger());

        return raceHeroes;
    }

    private static Map<String, AbstractRace> getHumanHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Monk());
        raceHeroes.put("2", new Paladin());

        return raceHeroes;
    }

    private static Map<String, AbstractRace> getDwarfHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Warrior());
        raceHeroes.put("2", new Mechanist());

        return raceHeroes;
    }

    private static Map<String, Map<String, AbstractRace>> initRaceMap() {
        Map<String, Map<String, AbstractRace>> races = new HashMap<>();
        races.put("1", getElfHeroes());
        races.put("2", getHumanHeroes());
        races.put("3", getDwarfHeroes());
        return races;
    }

    public static AbstractRace getHero(String race, String hero) throws IllegalAccessException, InstantiationException {
        Map<String, Map<String, AbstractRace>> raceMap = getRace();
        Map<String, AbstractRace> abstractRaceMap = raceMap.get(race);
        AbstractRace abstractRace = null;
        if (abstractRaceMap != null) {
            abstractRace = abstractRaceMap.get(hero);
            if (abstractRace != null) {
                abstractRace = abstractRace.getClass().newInstance();
            }
        }
        return abstractRace;
    }
}
