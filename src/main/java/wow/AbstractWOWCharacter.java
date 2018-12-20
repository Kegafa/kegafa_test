package wow;

public abstract class AbstractWOWCharacter implements WOWCharacter {
    private String className;
    protected String raceName;
    protected String frontName;

    public AbstractWOWCharacter(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getFrontName() {
        return frontName;
    }

}
