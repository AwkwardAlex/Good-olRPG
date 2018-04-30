package util;

import team.Team;

public class StatAllocation {

    public static void allocatePoints(Team team, int points, int chosenHero) {
        int pointsUsed = 0;
        while (points > 0) {
            GameOutput.printAllocationMenu(points);
            int choice = ScannerUtil.getInt();
            if (choice == 1) {
                pointsUsed = allocateCharisma(team, points, chosenHero);
            }
            if (choice == 2) {
                pointsUsed = allocateStamina(team, points, chosenHero);
            }
            if (choice == 3) {
                pointsUsed = allocateIntellect(team, points, chosenHero);
            }
            if (choice == 4) {
                pointsUsed = allocateAgility(team, points, chosenHero);
            }
            if (choice == 5) {
                pointsUsed = allocateConcentration(team, points, chosenHero);
            }
            points = points - pointsUsed;
        }
    }

    private static int allocateCharisma(Team team, int points, int chosenHero) {
        int amountOfPoints = InputData.getStatPoints(points);
        team.getTeam()[chosenHero].calculateCharisma(amountOfPoints);
        return amountOfPoints;
    }

    private static int allocateStamina(Team team, int points, int chosenHero) {
        int amountOfPoints = InputData.getStatPoints(points);
        team.getTeam()[chosenHero].calculateStamina(points);
        return amountOfPoints;
    }

    private static int allocateIntellect(Team team, int points, int chosenHero) {
        int amountOfPoints = InputData.getStatPoints(points);
        team.getTeam()[chosenHero].calculateIntellect(points);
        return amountOfPoints;
    }

    private static int allocateAgility(Team team, int points, int chosenHero) {
        int amountOfPoints = InputData.getStatPoints(points);
        team.getTeam()[chosenHero].calculateAgility(points);
        return amountOfPoints;
    }

    private static int allocateConcentration(Team team, int points, int chosenHero) {
        int amountOfPoints = InputData.getStatPoints(points);
        team.getTeam()[chosenHero].calculateConcentration(points);
        return amountOfPoints;
    }
}
