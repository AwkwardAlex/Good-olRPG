package util;

import hero.Dwarf.Mechanist;
import hero.Dwarf.Warrior;
import hero.Elf.Gunslinger;
import hero.Elf.Mage;
import hero.Humman.Monk;
import hero.Humman.Paladin;
import lombok.Getter;

import java.util.Scanner;

public class InputData {

    private Scanner scanner = new Scanner(System.in);

    @Getter
    Object hero;

    public Object InputData() {
        switch (scanner.nextInt()) {
            case 1:
                Mechanist mechanist = new Mechanist();
                hero = mechanist.createHero();
                break;
            case 2:
                Warrior warrior = new Warrior();
                hero = warrior.createHero();
                break;
            case 3:
                Gunslinger gunslinger = new Gunslinger();
                hero = gunslinger.createHero();
                break;
            case 4:
                Mage mage = new Mage();
                hero = mage.createHero();
                break;
            case 5:
                Monk monk = new Monk();
                hero = monk.createHero();
                break;
            case 6:
                Paladin paladin = new Paladin();
                paladin.createHero();
                break;
            default:
                System.out.println("null");
        }
        return hero;
    }
}