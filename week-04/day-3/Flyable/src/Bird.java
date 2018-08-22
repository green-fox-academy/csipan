public class Bird extends Animal implements Flyable {

  public Bird(String name, String color, String weight) {
    super(name, color, weight);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public String land() {
    return "horizontally.";
  }

  @Override
  public String fly() {
    return "by wings";
  }

  @Override
  public String takeOff() {
    return "horizontally";
  }

  @Override
  public int maxSpeed() {
    return 190;
  }
}
