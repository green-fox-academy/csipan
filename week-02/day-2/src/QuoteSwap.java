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
    // Expected output: "What I cannot create I do not understand."

  }
  public static String quoteSwap(List swapingWords) {
    int indexDo = swapingWords.indexOf("do");
    int indexCannot = swapingWords.indexOf("cannot");
  
    swapingWords.set(indexDo, "cannot");
    swapingWords.set(indexCannot, "do");
    String theNewSentence1 = "";
    for (int i = 0; i < swapingWords.size(); i += 1){
      theNewSentence1 += swapingWords.get(i) + " ";
    }
    return theNewSentence1;
  }
}