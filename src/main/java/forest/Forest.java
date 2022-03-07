package forest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Forest {

    private List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public void rain(){
        trees.forEach(Tree::irrigate);
    }

    public void cutTrees(Lumberjack lumberjack){
        trees.removeIf(lumberjack::canCut);
    }

    public List<Tree> getTrees() {
        return trees;
    }


    public boolean isEmpty() {
        return trees.isEmpty();
    }

    public List<String> getStatus() {
        List<String>result = new ArrayList<>();
        for (Tree actual : trees){
            result.add(actual.getStatus());
        }
        return result;
    }


}
