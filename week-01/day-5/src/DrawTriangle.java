import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your preferred number?");
    int number = scanner.nextInt();
    System.out.println();

    for (int row = 1; row <= number; row += 1) {
      for (int col = 1; col <= row; col += 1) {
          System.out.print("*");
      }
      System.out.println();
    }
  }
}

