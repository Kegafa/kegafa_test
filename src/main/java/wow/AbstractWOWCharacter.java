package wow;

public class AbstractWOWCharacter implements WOWCharacter {
    private String className;
    protected String raceName;
    protected String fractionName;

    public AbstractWOWCharacter (String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getFractionName() {
        return fractionName;
    }

}
