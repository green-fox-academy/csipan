import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<dominoes> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(orderedDominoes(dominoes));
    System.out.println(dominoes);
  }

  static List<dominoes> initializeDominoes() {
    List<dominoes> dominoes = new ArrayList<>();
    dominoes.add(new dominoes(5, 2));
    dominoes.add(new dominoes(4, 6));
    dominoes.add(new dominoes(1, 5));
    dominoes.add(new dominoes(6, 7));
    dominoes.add(new dominoes(2, 4));
    dominoes.add(new dominoes(7, 1));
    return dominoes;
  }

  static List<dominoes> orderedDominoes(List<dominoes> dominoes) {
    List<dominoes> oderedDominoes = new ArrayList<>();
    oderedDominoes.add(dominoes.get(5));
    for (int j = 0; j < dominoes.size() - 1; j += 1) {
      for (int i = 0; i < dominoes.size(); i += 1) {
        if (oderedDominoes.get(oderedDominoes.size() - 1).getValues()[1] == dominoes.get(i).getValues()[0]) {
          oderedDominoes.add(dominoes.get(i));
          break;
        }
      }
    }
    return oderedDominoes;
  }
}