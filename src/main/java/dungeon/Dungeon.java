package dungeon;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Dungeon {

    private ArrayList<Room> rooms = new ArrayList<>();
    private int maxLength;
    private static final int DUNGEON_MAIN_LENGTH = 7;
    private static final int DUNGEON_SIDE_LENGTH = 4;

    public Dungeon() {
        maxLength = DUNGEON_MAIN_LENGTH + (int) (Math.random() * 3);
        dungeonGenerator();
    }

    private void dungeonGenerator() {
        generateMainLine();
        for (int i = 0; i < DUNGEON_SIDE_LENGTH; i++) {
            generateSideLine();
        }
    }

    private void generateMainLine() {
        Room room1 = new Room(RoomDescription.RS);
        Room room2;
        this.rooms.add(room1);
        for (int i = 1; i < maxLength; i++) {
            int number1 = (int) (Math.random() * (RoomDescription.values().length - 2));
            room2 = new Room((RoomDescription.valueOf("R" + number1)));
            generateExits(room1, room2);
            this.rooms.add(room2);
            room1 = room2;
        }
        room2 = new Room(RoomDescription.RE);
        generateExits(room1, room2);
        this.rooms.add(room2);
    }

    private void generateSideLine() {
        int random = (int) (Math.random() * (maxLength - 1)) + 1;
        Room room1 = this.rooms.get(random);
        for (int i = 0; i < Math.random() * 2 + 3; i++) {
            int num1 = (int) (Math.random() * (RoomDescription.values().length - 2));
            Room room2 = new Room(RoomDescription.valueOf("R" + num1));
            generateExits(room1, room2);
            this.rooms.add(room2);
            room1 = room2;
        }
    }

    private void generateExits(Room room1, Room room2) {
        room1.addExit(room2);
        room2.addExit(room1);
    }


    // Test method for printing out map
    /*
    public void printMap() {
        for (int i = 0; i < maxLength; i++) {
            System.out.println(this.rooms.get(i).getName() + " >>>> ");
            for (Room room:this.rooms.get(i).getExits()) {
                System.out.println("["+room.getName()+"] ");
            }
            System.out.println();
        }
    }
    */
}
