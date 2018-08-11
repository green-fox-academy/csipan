import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your preferred number?");
    int number = scanner.nextInt();
    System.out.println();

    int noOfSpaces = number - 1;
    for (int row = 1; row <= number + number - 1; row += 2) {
      for (int i = 0; i <= noOfSpaces; i += 1) {
        System.out.print(" ");
      }
      for (int column = 1; column <= row; column += 1) {
        System.out.print("*");
      }
      System.out.println();
      noOfSpaces = noOfSpaces - 1;
    }

  }
}

