import java.util.ArrayList;

public class Sum {
  ArrayList<Integer> listOfNumbers = new ArrayList<>();

  public void addNumber(int numbers) {
    listOfNumbers.add(numbers);
  }

  public int sumOfTheList() {
    int sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i += 1) {
      sum += listOfNumbers.get(i);
    }
    return sum;
  }
}
