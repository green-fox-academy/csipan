import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5

    Scanner scanner = new Scanner(System.in);

    System.out.println("Can you let me know your first number, please?");
    int firstNumber = scanner.nextInt();

    System.out.println("Can you let me know your second number, please?");
    int secondNumber = scanner.nextInt();

    if (secondNumber <= firstNumber) {
      System.out.println("The second number should be bigger");
      System.out.println("Can you try again, please?");

      int secondNumberAgain = scanner.nextInt();
      if (secondNumberAgain <= firstNumber) {
        System.out.println("Still not bigger. Try again later :)");
      }
      else {
        for (int i = firstNumber; i <= secondNumberAgain; i += 1) {
          System.out.println(i);
        }
      }
//      System.out.println();
    }
    else {
      for (int i = firstNumber; i <= secondNumber; i += 1) {
        System.out.println(i);
      }
    }
  }
}
