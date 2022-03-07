package forest;

public abstract class Tree {

    private static final int INITIAL_HEIGHT = 0;

    protected int height;

    public Tree() {
        this.height = INITIAL_HEIGHT;
    }

    public Tree(int height) {
        this.height = height;
    }

    abstract void irrigate();

    public void setHeight(int number){
        height += number;
    }

    public int getHeight() {
        return height;
    }
    abstract String getStatus();
}
