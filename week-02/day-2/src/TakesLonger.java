public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String addquote = " always takes longer than";
    int index = quote.indexOf(" you");
    System.out.println(index);

    String quote1 = quote.substring(0, 20);
    System.out.println(quote1);

    String quote2 = quote.substring(20);
    System.out.println(quote2);

    String finalquote = quote1 + addquote + quote2;
    System.out.println(finalquote);
  }
}