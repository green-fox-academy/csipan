import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hi. Give me a number and I will let you know if the number is odd or even :)");
    int number = scanner.nextInt();

    // with boolean expression
    boolean even = (number % 2 == 0);
    if (even) {
      System.out.println("The number is even :)");
    }
    else  {
      System.out.println("The number is odd :)");
    }

    //without boolean expression
    if (number % 2 == 0) {
      System.out.println("The number is even :)");
    }
    else {
      System.out.println("The number is odd :)");
    }
  }
}
