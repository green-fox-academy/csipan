import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hi. Give me a number :)");
    int number = scanner.nextInt();

    boolean zeroOrSmaller = number <= 0;
    boolean one = number == 1;
    boolean two = number == 2;
    boolean moreThanTwo = number > 2;

    if (zeroOrSmaller) {
      System.out.println("Not enough");
    }
    else if (one) {
      System.out.println("One");
    }
    else if (two) {
      System.out.println("Two");
    }
    else if (moreThanTwo) {
      System.out.println("A lot");
    }
  }
}
