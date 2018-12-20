package wow.horde;

import wow.AbstractWOWCharacter;

public class Goblin extends AbstractWOWCharacter {
    public Goblin(String className) {
        super(className);
        raceName = "Goblin";
        fractionName = "Horde";
    }
}