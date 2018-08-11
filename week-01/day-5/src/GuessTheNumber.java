import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8


    Scanner scanner = new Scanner(System.in);
    System.out.println("Think a number between 0 and 50 :)");
    int number = (int) (Math.random() * 50 + 1);
    boolean found = false;

    while (found==false){
      int guess = scanner.nextInt();
      if (guess == number){
        System.out.println("You found the number: " + number);
        found = true;
      }else if(guess < number) {
        System.out.println("The stored number is higher");
      }else if(guess > number) {
        System.out.println("The stored number is lower");
      }
    }
  }
}