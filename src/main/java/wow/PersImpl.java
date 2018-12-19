package wow;

public class PersImpl implements Pers {
    private String className;
    protected String raceName;
    protected String frontName;

    public PersImpl(String className) {
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
