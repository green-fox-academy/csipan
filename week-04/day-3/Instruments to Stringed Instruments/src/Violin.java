public class Violin extends StringedInstrument {

  public Violin() {
    super(4, "Violin");
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}
