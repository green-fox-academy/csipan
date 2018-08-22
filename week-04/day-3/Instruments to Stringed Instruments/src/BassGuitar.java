public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4, "Bass Guitar");
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings, "Bass Guitar");
  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Duum-duum-duum");
  }
}
