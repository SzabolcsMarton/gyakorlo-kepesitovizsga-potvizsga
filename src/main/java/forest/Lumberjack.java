package forest;

public class Lumberjack {

    private static final int MIN_TREE_HEIGHT_TO_CUT = 4;

    public boolean canCut(Tree tree){
        return tree.getHeight() > MIN_TREE_HEIGHT_TO_CUT;
    }
}
