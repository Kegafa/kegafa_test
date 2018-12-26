package wow.horde;

import wow.Variables;

public class Undead extends AbstractHordeCharacter {
    public Undead(String className) {
        super(className);
        raceName = Variables.UNDEAD;
    }
}