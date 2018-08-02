import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hi. Give me two numbers and I will tell which one is bigger :)");

    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();

    boolean whichOneIsBigger = number1 > number2;

    if (whichOneIsBigger) {
      System.out.println(number1);
    }
    else {
      System.out.println(number2);
    }
  }
}
