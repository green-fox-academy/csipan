import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Flower> flowers;
  List<Tree> trees;

  public Garden() {
    flowers = new ArrayList<Flower>();
    trees = new ArrayList<Tree>();
  }

  public void info() {
    System.out.println("This garden has " + flowers.size() + " and " + trees.size() + ".");
  }

  public void addFlowers(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }


}
