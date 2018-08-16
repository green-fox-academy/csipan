import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a word with random x-es inside the word.");
    String word = scanner.nextLine();
    System.out.println(changeXtoY(word));
  }
  public static String changeXtoY(String word) {
    if (word.length() == 0) {
      return word;
    }
    else if (word.charAt(0) == 'x'){
      return (('y')+ changeXtoY(word.substring(1)));
    }
    else {
      return (word.charAt(0) + changeXtoY(word.substring(1)));
    }
  }
}
