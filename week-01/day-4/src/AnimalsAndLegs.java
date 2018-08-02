import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hi. How many chickens does the farmer have?");
    int chickens = scanner.nextInt();
    System.out.println("Hi. How many pigs does the farmer have?");
    int pigs = scanner.nextInt();
    int chickenLegs = chickens * 2;
    int pigLegs = pigs * 4;
    int totalLegs = chickenLegs + pigLegs;
    System.out.println("All the animals have: " + totalLegs + " legs");
  }
}
