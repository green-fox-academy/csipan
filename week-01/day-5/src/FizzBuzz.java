public class FizzBuzz {
  public static void main(String[] args) {
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.

    for (int number = 1; number <=100; number += 1) {
      if (number % 3 == 0 && number % 5 == 0) {
        System.out.println("FizzBuzz");
      }
        else if (number % 5 == 0) {
          System.out.println("Buzz");
        }
        else  if (number % 3 == 0) {
          System.out.println("Fizz");
        }
      else {
         System.out.println(number);
      }
    }
  }
}
