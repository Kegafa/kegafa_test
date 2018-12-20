package wow.Aliance;

import wow.AbstractWOWCharacter;

public class Human extends AbstractWOWCharacter {
    public Human(String className) {
        super(className);
        raceName = "Human";
        fractionName = "Alliance";
    }
}
