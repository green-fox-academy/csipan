import java.util.Scanner;

  public class String2 {
    public static void main(String[] args) {
      // Given a string, compute recursively a new string where all the 'x' chars have been removed.

      Scanner scanner = new Scanner(System.in);
      System.out.println("Give me a string with x-es and I will delete them all.");
      String word = scanner.nextLine();
      System.out.println(wordWithoutX(word));
    }
    public static String wordWithoutX(String word) {
    if (word.length() == 0){
      return word;
    }
    else if (word.charAt(0) == 'x') {
      return (wordWithoutX(word.substring(1)));
    }
    else {
      return (word.charAt(0) + wordWithoutX(word.substring(1)));
    }
  }
 }
