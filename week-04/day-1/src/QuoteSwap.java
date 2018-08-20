import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    System.out.println(quoteSwap2(list));
    // Expected output: "What I cannot create I do not understand."

  }
  //simán kicseréli a két szót, de egy array listet ad vissza, ami nem a feladat
  public static ArrayList<String> quoteSwap(ArrayList<String> swapWords) {
    swapWords.set(2, "cannot");
    swapWords.set(5, "do");
    //    System.out.println(Arrays.asList(swapWords));
    return swapWords;
  }
  //egy másik módszerrel, hogy szép szövegként hozza ki a mondatot
  public static String quoteSwap2(ArrayList<String> swapWords) {
    swapWords.set(2, "cannot");
    swapWords.set(5, "do");
    String theNewSentence = "";
    for (int i = 0; i < swapWords.size(); i += 1) {
      theNewSentence += swapWords.get(i) + " ";
    }
    return theNewSentence;
  }
}