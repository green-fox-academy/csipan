import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to th e n power, so powerN(3, 2) is 9 (3 squared).
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number, please.");
    int number = scanner.nextInt();
    System.out.println("Give me another number which will be the power for your previous number.");
    int power = scanner.nextInt();
    System.out.println(powerNumber(number, power));

  }
    public static int powerNumber(int number, int power) {
      if (power == 1) {
        return number;
      }
      else {
          return (number * powerNumber(number, power - 1));
      }
    }
  }
