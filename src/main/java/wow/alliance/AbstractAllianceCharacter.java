package wow.alliance;

import wow.AbstractWOWCharacter;
import wow.Variables;

public abstract class AbstractAllianceCharacter extends AbstractWOWCharacter {
    AbstractAllianceCharacter(String className) {
        super(className);
        fractionName = Variables.ALLIANCE;

    }
}
