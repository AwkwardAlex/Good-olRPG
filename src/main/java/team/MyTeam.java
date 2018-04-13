package team;

import util.InputData;

import java.util.ArrayList;
import java.util.List;

public class MyTeam {

    public void CreateTeam() {
        List<Object> newTeam = new ArrayList<>(3);
        InputData inputData = new InputData();
        for (int i = 0; i < 3; i++) {
            newTeam.add(inputData.InputData());
        }
        System.out.println("\nYour team: " + newTeam);
    }
}
