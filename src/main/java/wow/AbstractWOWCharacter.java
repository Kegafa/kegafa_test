package wow;

public abstract class AbstractWOWCharacter implements WOWCharacter {
    private String className;
    protected String raceName;
    protected String fraction;

    public AbstractWOWCharacter(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getFraction() {
        return fraction;
    }

}
