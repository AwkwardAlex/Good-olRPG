package dungeon;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Room {

    public String name;
    public String description;
    private List<Room> exits = new ArrayList<>();
    public boolean hasEnemies = false;
    private int sumEnemyHP;


    Room(RoomDescription roomDescription) {
        this.name = roomDescription.getName();
        this.description = roomDescription.getDescription();
        createEnemies();
    }

    public void addExit(Room room) {
        exits.add(room);
    }

    public int printExits(Room previousRoom) {
        int previous = (int) (Math.random() * exits.size());
        for (int i = 0; i < exits.size(); i++) {
            int index = (previous + i) % exits.size();
            System.out.println("[" + (i + 1) + "] "
                    + ((previousRoom == exits.get(index)) ? "(back) " : "")
                    + exits.get(index).getName());
        }
        return previous;
    }

    public void printRoomInfo() {
        printRoomDesc(name, description);
    }

    private void printRoomDesc(String name, String description) {
        String line = " <" + name + "> \n" + description;
        System.out.println(line);
    }

    // The following method is still work in progress
    private void createEnemies() {
        if (Math.random() < 0.5) {
            setHasEnemies(true);
        }
        if (hasEnemies) {
            setSumEnemyHP((int) (Math.random() * 100));
        }
    }
}
