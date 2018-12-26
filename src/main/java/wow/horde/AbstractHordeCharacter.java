package wow.horde;

import wow.AbstractWOWCharacter;
import wow.Variables;

public abstract class AbstractHordeCharacter extends AbstractWOWCharacter {

    AbstractHordeCharacter(String className) {
        super(className);
        fractionName = Variables.HORDE;

    }
}
