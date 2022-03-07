package forest;

public class WhitebarkPine extends Tree{

    private static final int GROW_UNIT =2;

    public WhitebarkPine() {
        super();
    }

    public WhitebarkPine(int number) {
        super(number);
    }

    @Override
    void irrigate() {
      setHeight(GROW_UNIT);
    }

    @Override
    String getStatus() {
        return String.format("There is a %d tall WhitebarkPine in the forest.", height);
    }
}
