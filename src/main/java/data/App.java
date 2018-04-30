package data;

import dungeon.Dungeon;
import lombok.Getter;
import race.abstraction.AbstractRace;
import team.Team;
import util.GameOutput;
import util.InputData;
import util.StatAllocation;

@Getter
public class App {

    public final static Dungeon dungeon = new Dungeon();
    private static Team team;
    private static final int TEAM_MEMBERS = 3;
    private static final int LEVEL_UP_POINTS = 10;

    public void startGame() {
        String teamName = InputData.choseTeamName();
        team = new Team(teamName);
        for (int i = 0; i < TEAM_MEMBERS; i++) {
            GameOutput.printHeroInfo(team, i);
            GameOutput.printHeroStats(team, i);
            StatAllocation.allocatePoints(team, LEVEL_UP_POINTS, i);
            GameOutput.printHeroStats(team, i);
        }
        System.out.println("Your party wakes up in a dungeon without any recollection of what happened yesterday.\n" +
                " After digging through memories you recall being at the local pub, drinking your night away.\n" +
                " At last you pieced all your memories together and realised that you had\n" +
                " one too many drinks yesterday and in drunken rage attacked a nearby guard,\n" +
                " whom you mistook for a funny-looking ork...\n" +
                " Can't blame you, they do have ridiculously confusing uniforms these days...");
        turn();
    }

    private void turn() {
        String s = team.getCurrentRoom().getName();
        while (!"Exit room".equals(s)) {
            team.getCurrentRoom().printRoomInfo();
            checkLvlUp(team);
            team.chooseNextRoom(team.getCurrentRoom());
            s = team.getCurrentRoom().getName();
        }
    }

    private void checkLvlUp(Team team) {
        int currentLvl = team.calculateLvlSum();
        team.battlePhase();
        for (int i = 0; i < TEAM_MEMBERS; i++) {
            if (currentLvl != team.calculateLvlSum()) {
                StatAllocation.allocatePoints(team, LEVEL_UP_POINTS, i);
            }
        }
    }
}
