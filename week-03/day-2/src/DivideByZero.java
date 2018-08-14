import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a number and I will dived 10 with it");
    int number = scanner.nextInt();
    recallFunction(number);
  }

    public static void recallFunction(int number){
      try {
        int result = 10 / number;
        System.out.println(result);
      } catch (ArithmeticException e) {
        System.out.println("fail");
      }
    }
  }
