import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me your number:");
    int number = scanner.nextInt();
    System.out.println(numberAdder(number));
  }
  public static int numberAdder(int number) {
    if (number == 1) {
      return 1;
    }
    else {
      return (number + (numberAdder(number - 1)));
    }
  }
}
