import java.util.Scanner;

public class Bunny2 {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bunnies number:");
    int numbers = scanner.nextInt();
    int ears = 2;
    System.out.println(mixedBunnyEars(numbers,ears));
  }
  public static int mixedBunnyEars(int numbers, int ears) {
    if (numbers == 1) {
      return ears;
    }
    else if (numbers % 2 != 0) {
      return (ears + mixedBunnyEars(numbers - 1, ears));
    }
    else  {
      return (ears + 1 + mixedBunnyEars(numbers - 1, ears));
    }
  }
}
