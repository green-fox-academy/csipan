import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    // Create a program that asks for a number and prints the multiplication table with that number
    //
    // Example:
    // The number 15 should print:
    //
    // 1 * 15 = 15
    // 2 * 15 = 30
    // 3 * 15 = 45
    // 4 * 15 = 60
    // 5 * 15 = 75
    // 6 * 15 = 90
    // 7 * 15 = 105
    // 8 * 15 = 120
    // 9 * 15 = 135
    // 10 * 15 = 150

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hi. What multiplication table would you like to view?");
    int numberForMultiplication = scanner.nextInt();

    for (int multiplicator = 1; multiplicator < 11; multiplicator += 1) {
      int total = multiplicator * numberForMultiplication;
      System.out.println(multiplicator + " x " + numberForMultiplication + " = " + total);
    }
  }
}
