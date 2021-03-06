import java.util.*;

public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Expected output: "Eve", "Joe", "Ashley", "Fred"...

    makingMatches(girls, boys);
  }
  public static void makingMatches(ArrayList girls, ArrayList boys) {
    int arraySize = girls.size();
    for (int i = 0; i <= girls.size(); i += 1) {
      if (i < arraySize) {
        System.out.print(girls.get(i) + ", ");
        System.out.print(boys.get(i) + ", ");
      }
      else {
        System.out.print(boys.get(i) + " ");
      }
    }
  }
}