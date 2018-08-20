import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.
    // The output should be: "boa", "anaconda", "koala", "panda", "zebra"
    System.out.println(appendA(far));
  }
  public static List<String> appendA(List<String> addLetter) {
    for (int i = 0; i < addLetter.size(); i += 1) {
      addLetter.set(i, addLetter.get(i) + "a");
    }
    return addLetter;
  }
}

