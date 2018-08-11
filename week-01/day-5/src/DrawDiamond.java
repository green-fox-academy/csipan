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
      int spaceUpperPart = number - 1;
      for (int row = 1; row <= number / 2; row += 1) {
        for (int i = 1; i <= number / 2 - row; i += 1){
          System.out.print(" ");
        }
        for (int column = 1; column <= 2 * row - 1; column  += 1){
          System.out.print("+");
        }
        System.out.println();
        spaceUpperPart = spaceUpperPart - 1;
      }
      int spaceDownPart = 0;
      for (int row = 1; row <= number / 2; row += 1) {
        for (int i = row - 1; i >= 1; i -= 1) {
          System.out.print(" ");
        }
        for (int column = number - 1; column >= 2 * row - 1; column -= 1) {
          System.out.print("+");
        }
        System.out.println();
        spaceDownPart = spaceDownPart + 1;
      }
    }
    else {
      int spaceUpperPart = number - 1;
      for (int row = 1; row <= number / 2 + 1; row += 1) {
        for (int i = 1; i <= number / 2 + 1 - row; i += 1){
          System.out.print(" ");
        }
        for (int column = 1; column <= 2 * row - 1; column  += 1){
          System.out.print("+");
        }
        System.out.println();
        spaceUpperPart = spaceUpperPart - 1;
      }
      int spaceDownPart = 0;
      for (int row = 1; row <= number / 2 + 1; row += 1) {
        for (int i = row; i >= 1; i -= 1) {
          System.out.print(" ");
        }
        for (int column = number - 1; column >= 2 * row; column -= 1) {
          System.out.print("+");
        }
        System.out.println();
        spaceDownPart = spaceDownPart + 1;
      }
    }
  }
}
