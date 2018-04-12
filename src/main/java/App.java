import Hero.Elf.Gunslinger;
import Hero.Elf.Mage;
import Hero.Humman.Monk;

public class App {
    public static void main(String[] args) {
        Gunslinger gunslinger = new Gunslinger();
        gunslinger.createHero();
        Mage mage = new Mage();
        mage.createHero();
        Monk monk = new Monk();
        monk.createHero();
    }
}
