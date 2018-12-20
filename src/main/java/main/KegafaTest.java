package main;

import wow.*;

public class KegafaTest {

    public static void main(String[] args) {
        new KegafaTest().run();
    }

    private void run() {
        Pers pers1 = new Worgen("rogue");
        System.out.println("Pers1 class: " + pers1.getClassName() + ", race: " + pers1.getRaceName() + ", front: " + pers1.getFrontName());
    }
}
