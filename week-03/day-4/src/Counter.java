import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me your number.");
    int number = scanner.nextInt();
    counter(number);
//    int sum = 0;
//
//    for (int i = number; i >= 0; i -= 1) {
//      sum += i;
//    }
//    System.out.println("Sum of your numbers from your numbre till 0 is: " + sum);
  }

  public static void counter(int number) {
    if (number == 0) {
      System.out.println(0);
    }
    else {
      System.out.println(number);
      counter(number -= 1);         //újra és újra vissza hívom a számot
    }
  }
}
