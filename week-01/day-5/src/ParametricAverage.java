import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    int lengthOfTheNumbers;                                                 //initializing an unknown length of numbers
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers do you want to declare?");
    lengthOfTheNumbers = scanner.nextInt();

    int[] numbers = new int[lengthOfTheNumbers];

    for (int counter = 0; counter < lengthOfTheNumbers; counter += 1) {
      System.out.print("Your " + (counter + 1) + " number is: ");
      numbers[counter] = scanner.nextInt();
    }
    scanner.close();

    
  }
}
