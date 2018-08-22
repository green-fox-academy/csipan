public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;

  public StringedInstrument(int numberOfStrings, String string) {
    super(string);
    this.numberOfStrings = numberOfStrings;
  }

  public abstract void sound();

  public void play() {
    sound();
  }
}
