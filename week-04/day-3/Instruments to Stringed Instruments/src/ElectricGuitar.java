public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super(6, "Electric Guitar");
  }

//  public ElectricGuitar(int numberOfStrings) {
//    this.numberOfStrings = numberOfStrings;
//  }

//  public ElectricGuitar(){
//    return;
//  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
