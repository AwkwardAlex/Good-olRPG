package team;

import data.App;
import dungeon.Room;
import lombok.Setter;
import map.HeroMap;
import race.abstraction.AbstractRace;
import util.InputData;
import util.ScannerUtil;
import util.StatAllocation;


@lombok.Getter
@Setter
public class Team {

    private static final int TEAM_MEMBERS = 3;

    private String name;

    private AbstractRace[] team;

    private Room currentRoom;

    private Room lastRoom;

    private static final int TESTING_XP = 300;

    public Team(String name) {
        team = createTeam();
        this.name = name;
        currentRoom = App.dungeon.getRooms().get(0);
        lastRoom = currentRoom;
    }

    private AbstractRace[] createTeam() {
        AbstractRace[] newTeam = new AbstractRace[TEAM_MEMBERS];
        newTeam[0] = createLeader();
        for (int i = 1; i < TEAM_MEMBERS; i++) {
            System.out.println("You are now creating another hero.");
            newTeam[i] = createHero();
        }
        return newTeam;
    }

    private AbstractRace createHero() {
        try {
            String heroName = InputData.choseName();
            String race = InputData.choseRace();
            String classChoice = InputData.choseClass(race);
            AbstractRace newHero = HeroMap.getHero(race, classChoice);
            newHero.setHeroName(heroName);
            return newHero;
        } catch (IllegalAccessException | InstantiationException e) {
            System.err.println("Caught" + e);
        }
        return null;
    }

    private AbstractRace createLeader() {
        System.out.println("You are now creating a leader for your team.");
        AbstractRace newLeader = createHero();
        if (newLeader != null) {
            newLeader.setLeader();
        }
        return newLeader;
    }

    public void chooseNextRoom(Room room) {
        int lastRoom = room.printExits(this.lastRoom);
        int next = ScannerUtil.getInt();
        room = room.getExits().get((next + lastRoom - 1) % room.getExits().size());
        setCurrentRoom(room);
    }

    private void setCurrentRoom(Room room) {
        lastRoom = this.currentRoom;
        this.currentRoom = room;
    }

    // The following method is still work in progress
    public void battlePhase() {
        if (currentRoom.getSumEnemyHP() != 0) {
            System.out.println("BATTLE PHASE");
            System.out.println("There are enemies in this room, they are way to abstract \n" +
                    "to possess any sort of fighting capabilities. You decided to leave them \n" +
                    "to their cruel existence and march onwards.");
            distributeExperience(TESTING_XP);

        }
    }

    private void distributeExperience(int sumExperience) {
        int lvlSum = calculateLvlSum();
        for (AbstractRace hero : team) {
            hero.levelUp(sumExperience, lvlSum);
        }
    }

    public int calculateLvlSum() {
        int i = 0;
        for (AbstractRace hero : team) {
            i += hero.getLevel();
        }
        return i;
    }
}
