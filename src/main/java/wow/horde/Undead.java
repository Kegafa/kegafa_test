package wow.horde;

import wow.AbstractWOWCharacter;

public class Undead extends AbstractWOWCharacter {
    public Undead(String className) {
        super(className);
        raceName = "Undead";
        fractionName = "Horde";
    }
}