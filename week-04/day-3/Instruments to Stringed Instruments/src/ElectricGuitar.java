public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super(6, "Electric Guitar");
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings, "Electric Guitar");
  }

//  public ElectricGuitar(){
//    return;
//  }

  @Override
  public void sound() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes Twang");
  }
}
