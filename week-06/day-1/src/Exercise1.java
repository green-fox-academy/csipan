import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the even numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

//  a páros számokat kinyomttatom egy sorba növekvő sorrendbe vesszővel elválasztva
    String numbersInString = numbers.stream()             // a streamet szöveggé alakítom
            .filter(x -> x % 2 == 0)                      // szűröm páros számra
            .sorted()                                     // növekvő sorrendbe rendezem
            .map(number -> String.valueOf(number))        // szövegé alakítom az egyes számokat
            .collect(Collectors.joining(", "));   // összerakom öket a szöveggé és veszővel elválasztom
    System.out.println(numbersInString);                  // kinyomtatom az eredményt

//  csak simán kinyomtatja a páros számokat
    numbers.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
  }
}
