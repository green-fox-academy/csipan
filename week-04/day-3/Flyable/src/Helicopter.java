public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, String color, String weight) {
    this.name = name;
    this.color = color;
    this.weight = weight;
  }

  @Override
  public String land() {
    return "vertically.";
  }

  @Override
  public String fly() {
    return "by rotors";
  }

  @Override
  public String takeOff() {
    return "vertically";
  }

  @Override
  public int maxSpeed() {
    return 294;
  }

}
