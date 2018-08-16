import java.util.Scanner;

public class String3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a string with x-es and I will delete them all.");
    String word = scanner.nextLine();
    System.out.println(wordWithStars(word));
  }
  public static String wordWithStars(String word) {
    if (word.length() == 1){
      return word;
    }
    else {
      return (word.charAt(0) + "*" + wordWithStars(word.substring(1)));
    }
  }
}
