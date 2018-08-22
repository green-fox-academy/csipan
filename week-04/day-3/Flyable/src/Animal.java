public abstract class Animal {
  protected String name;
  protected int age;


  public Animal(String name) {
    this.name = name;
  }

  public abstract String getName();

  public abstract String breed();
}
