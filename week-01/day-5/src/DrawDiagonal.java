import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number, please!");
    int number = scanner.nextInt();

    for (int row = 1; row <= number; row += 1) {
      for (int column = 1; column <= number; column += 1) {
        if (row == 1 || row == number || column == 1 || column == number || row == column) {
          System.out.print("+");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}