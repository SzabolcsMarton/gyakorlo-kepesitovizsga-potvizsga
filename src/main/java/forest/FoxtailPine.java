package forest;

public class FoxtailPine extends Tree {
    private static final int GROW_UNIT = 1;

    public FoxtailPine() {
        super();
    }

    public FoxtailPine(int number) {
        super(number);
    }

    @Override
    void irrigate() {
        setHeight(GROW_UNIT);
    }

    @Override
    String getStatus() {
        return String.format("There is a %d tall FoxtailPine in the forest.", height);
    }
}
