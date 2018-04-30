package util;

public class InputData {

    private static InputData inputData;

    private InputData() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of UserInput");
    }

    public static InputData getInput() {
        if (inputData == null) {
            inputData = new InputData();
        }
        return inputData;
    }

    public static String choseTeamName() {
        System.out.println("Enter a name for your team: ");
        while (true) {
            String teamName = ScannerUtil.getString();
            System.out.println("You have chosen: " + teamName +
                    " as your team name.\nPress 1 to confirm this choice, or press any other button to change name");
            if ("1".equals(ScannerUtil.getString())) {
                return teamName;
            } else {
                System.out.println("Enter another name.");
            }
        }
    }

    public static String choseRace() {
        while (true) {
            GameOutput.printRaces();
            String race = ScannerUtil.getString();
            if ("4".equals(race)) {
                GameOutput.printRaceStats();
            } else if ("1".equals(race) | "2".equals(race) | "3".equals(race)) {
                return race;
            } else
                System.out.println("Choice not recognized");
        }
    }

    public static String choseClass(String race) {
        while (true) {
            GameOutput.printClasses(race);
            String classChoice = ScannerUtil.getString();
            if ("1".equals(classChoice) | "2".equals(classChoice)) {
                return classChoice;
            }
            System.out.println("Wrong input, please try again.");
        }
    }

    public static String choseName() {
        System.out.println("Enter a name for this character: ");
        String heroName;
        while (true) {
            heroName = ScannerUtil.getString();
            System.out.println("Press 1 if you want to keep this name, or press any other button to change name.");
            if ("1".equals(ScannerUtil.getString())) {
                return heroName;
            } else {
                System.out.println("Enter another name.");
            }
        }
    }

    public static int getStatPoints(int statPoint) {
        System.out.println("Enter the number of points you want to allocate to this particular stat: ");
        while (true) {
            int point = ScannerUtil.getInt();
            if (statPoint >= point && point > 0) {
                return point;
            }
            System.out.println("You've entered wrong amount of points, please try again.");
        }
    }
}