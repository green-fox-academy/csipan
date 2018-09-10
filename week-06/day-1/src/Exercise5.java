import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    //  Write a Stream Expression to find the uppercase characters in a string!

    String sentence = "Gyere velem a Hargitara, Laci";
    String upperCharacters =  sentence.chars()
            .filter(s -> Character.isUpperCase(s))
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining(", "));
    System.out.println(upperCharacters);
  }
}
