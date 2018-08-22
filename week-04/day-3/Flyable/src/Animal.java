public abstract class Animal {
  String name;
  String color;
  String  weight;


  public Animal(String name, String color, String weight) {
    this.name = name;
    this.color = color;
    this.weight = weight;
  }

  public abstract String getName();

  public abstract String breed();

}
