public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    super(name);
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
    return "horizontally";
  }

  @Override
  public String fly() {
    return "by wings";
  }

  @Override
  public String takeOff() {
    return "horizontally";
  }
}
