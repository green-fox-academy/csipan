public class Shifter implements CharSequence {

  String string;
  int number;

  public Shifter(String string, int number) {
    this.string = string;
    this.number = number;
  }

  @Override
  public int length() {
    return string.length() + number;
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(start + number, end + number);
  }
}
