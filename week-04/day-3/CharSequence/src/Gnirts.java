import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    String stringBackwards = "";
    for (int i = string.length() - 1; i >= 0; i -= 1) {
      stringBackwards += string.charAt(i);
    }
    return stringBackwards.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.substring(start, end);
  }
}
