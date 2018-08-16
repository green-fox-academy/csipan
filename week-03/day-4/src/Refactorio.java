import java.util.Scanner;

public class Refactorio {
  public static void main(String[] args) {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number");
    int number = scanner.nextInt();
    System.out.println(refactorio(number));
  }
  public static int refactorio(int number) {
    if (number == 1) {
      return number;
    }
    else {
      return number * refactorio(number - 1);
    }
  }
}
