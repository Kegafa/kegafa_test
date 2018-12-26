package wow.horde;

import wow.AbstractWOWCharacter;

public abstract class AbstractHordeCharacter extends AbstractWOWCharacter {

    AbstractHordeCharacter(String className) {
        super(className);
        fractionName = "Horde";

    }
}
