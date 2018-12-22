package main;

import wow.*;
import wow.alliance.*;
import wow.horde.*;

public class KegafaTest {

    public static void main(String[] args) {
        new KegafaTest().run();
    }

    private void run() {
        WOWCharacter pers1 = new NightElf("rogue");
        System.out.println("Pers1 class: " + pers1.getClassName() + ", race: " + pers1.getRaceName() + ", front: " + pers1.getFractionName());
    }
}
