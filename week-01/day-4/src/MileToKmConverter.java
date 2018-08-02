import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hi. Enter a number of kilometers you want to convert to miles.");
    int km = scanner.nextInt();
    double miles = km * 0.62;
    System.out.println(miles + " miles");
  }

}
