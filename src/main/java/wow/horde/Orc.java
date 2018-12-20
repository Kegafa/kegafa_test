package wow.horde;

import wow.AbstractWOWCharacter;

public class Orc extends AbstractWOWCharacter {
    public Orc(String className) {
        super(className);
        raceName = "Orc";
        fractionName = "Horde";
    }
}
