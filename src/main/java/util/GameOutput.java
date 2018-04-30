package util;

import team.Team;

public class GameOutput {

    private GameOutput() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of GameOutput");
    }

    public static void printRaces() {
        System.out.println("Chose one of three races:\n 1. Elf;\n 2. Human;\n 3. Dwarf;\n 4. View race stats.");
    }

    public static void printClasses(String race) {
        if ("1".equals(race)) {
            printElfClasses();
        } else if ("2".equals(race)) {
            printHumanClasses();
        } else if ("3".equals(race)) {
            printDwarfClasses();
        }
    }

    private static void printElfClasses() {
        System.out.println("Chose one of two classes: " + "\n 1. Mage;\n 2. Gunslinger.");
    }

    private static void printHumanClasses() {
        System.out.println("Chose one of two classes: " + "\n 1. Priest;\n 2. Paladin.");
    }

    private static void printDwarfClasses() {
        System.out.println("Chose one of two classes: " + "\n 1. Warrior;\n 2. Mechanist.");
    }

    public static void printRaceStats() {
        System.out.println("Description of races: ");
        System.out.println("Elf stats:\n " +
                "Charisma - 15, Stamina - 10, Intellect - 25, Agility - 22, Concentration - 18;\n" +
                "Human stats:\n Charisma - 10, Stamina - 30, Intellect - 20, Agility - 15, Concentration - 15;\n" +
                "Dwarf stats:\n Charisma - 5, Stamina - 45, Intellect - 15, Agility - 20, Concentration - 5.");
    }

    public static void printHeroInfo(Team team, int i) {
        System.out.println("Information about " + team.getTeam()[i].getHeroName() + ":\n " +
                "class - " + String.valueOf(team.getTeam()[i].getNameClass()) + ".");
    }

    public static void printHeroStats(Team team, int i) {
        System.out.println(team.getTeam()[i].getHeroName() + " stats:\n" +
                " Charisma - " + team.getTeam()[i].getCharisma() + ";\n" +
                " Stamina - " + team.getTeam()[i].getStamina() + ";\n" +
                " Intellect - " + team.getTeam()[i].getIntellect() + ";\n" +
                " Agility - " + team.getTeam()[i].getAgility() + ";\n" +
                " Concentration - " + team.getTeam()[i].getConcentration() + ".");
    }

    public static void printAllocationMenu(int points) {
        System.out.println("You have " + points + " stat points to allocate. Chose which stat you want to improve:" +
                "\n 1. Charisma;\n 2. Stamina;\n 3. Intellect\n 4. Agility\n 5. Concentration.");
    }
}
