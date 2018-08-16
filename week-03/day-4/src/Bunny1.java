import java.util.Scanner;

public class Bunny1 {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bunnies number:");
    int number = scanner.nextInt();
    int ears = 2;
    System.out.println(bunnyEars(number, ears));
  }
  public static int bunnyEars (int number, int ears) {
    if (number == 1) {
      return ears;
    }
    else {
      return (ears + bunnyEars(number - 1, ears));
    }
  }
}
