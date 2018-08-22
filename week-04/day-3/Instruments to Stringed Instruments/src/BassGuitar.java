public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4, "Bass Guitar");
  }

//  public BassGuitar(int numberOfStrings) {
//    this.numberOfStrings = numberOfStrings;
//  }
//
//  public BassGuitar() {
//    return;
//  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "- stringed instrument that goes Duum-duum-duum");
  }
}
