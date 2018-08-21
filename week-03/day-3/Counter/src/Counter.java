public class Counter {

  int counter = 0;
  int initialize;

  public Counter(int initialize) {
    this.initialize = initialize;
    this.counter = initialize;
  }

  public Counter() {

  }

  public void add(int number) {
    counter += number;
  }

  public void add() {
    counter += 1;
  }

  public int get() {
    return counter;
  }

  public int reset() {
    counter = initialize;
    return counter;
  }
}
