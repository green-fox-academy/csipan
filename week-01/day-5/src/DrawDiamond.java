import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your preferred number?");
    int number = scanner.nextInt();
    System.out.println();

    if (number % 2 == 0) {
      for (int row = 1; row <= number / 2; row += 1) {
        for (int col = 1; col <= row; col += 1) {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int row = 1; row <= number; row += 1) {
        for (int col = number / 2; col >= row; col -= 1) {
          System.out.print("+");
        }
        System.out.println();
      }
    }
    else if (number % 2 != 0) {
      for (int row = 1; row <= (number / 2) + 1; row += 1) {
        for (int col = 1; col <= row; col += 1) {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int row = 1; row <= number; row += 1) {
        for (int col = number / 2; col >= row; col -= 1) {
          System.out.print("/");
        }
        System.out.println();
      }
    }
  }
}
