import java.util.Scanner;

public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a positive number: ");
    int number = scanner.nextInt();
    System.out.println(sumDigits(number));
  }
  public static int sumDigits(int number) {
    if (number / 10 == 0) {
      return number;
    }
    else {
      return (number % 10 + sumDigits(number / 10));
    }
  }
}
