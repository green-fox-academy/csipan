import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!
    String string = "Na itt van ez a szoveg es elvileg megtudjuk, hogy mely betu hanyszor forudl elo.";
    Map<Character, Long> characterFrequencies = string.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    System.out.println(characterFrequencies);
  }
}
