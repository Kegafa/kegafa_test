package main;

import wow.*;
import wow.Horda.Goblin;

public class KegafaTest {

    public static void main(String[] args) {
        new KegafaTest().run();
    }

    private void run() {
        WOWCharacter pers1 = new Goblin("rogue");
        System.out.println("Pers1 class: " + pers1.getClassName() + ", race: " + pers1.getRaceName() + ", front: " + pers1.getFraction());
    }
}
