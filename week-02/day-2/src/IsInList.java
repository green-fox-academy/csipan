import java.util.*;
import java.util.stream.IntStream;

public class IsInList{
  public static void main(String... args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    System.out.println(checkNums(list));
    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"

  }
  public static boolean checkNums(ArrayList checkingTheList) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    if (checkingTheList.containsAll(numbers)){
      return true;
    }
    else {
      return false;
    }
  }
//  resolving stupidly :)
//  public static ArrayList checkNums(ArrayList list) {
//    if (list.containsAll(Arrays.asList(4, 8, 12, 16))) {
//      System.out.println("true");
//    }
//    else {
//      System.out.println("false");
//    }
//    return list;
//  }
}