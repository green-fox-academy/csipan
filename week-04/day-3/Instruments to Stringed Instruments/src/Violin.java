public class Violin extends StringedInstrument {

  public Violin() {
    super(4, "Violin");
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings, "Violin");
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Screech");
  }
}
