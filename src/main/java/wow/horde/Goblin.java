package wow.horde;

import wow.Variables;

public class Goblin extends AbstractHordeCharacter {
    public Goblin(String className) {
        super(className);
        raceName = Variables.GOBLIN;
    }
}