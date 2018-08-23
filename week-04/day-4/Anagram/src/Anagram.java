import java.util.ArrayList;

public class Anagram {
  String secondAnagramWord = "gyomorrontas";
  String firstAnagramWord = "toronymorgas";

  public static boolean checkIfAnagram (String firstAnagramWord, String secondAnagramWord) {
    ArrayList<Character> charactersOfFirstWord = new ArrayList<>();
    ArrayList<Character> charactersOfSecondWord = new ArrayList<>();

    for (int i = 0; i < firstAnagramWord.length(); i += 1) {
      charactersOfFirstWord.add(firstAnagramWord.charAt(i));
    }
    for (int i = 0; i < secondAnagramWord.length(); i += 1) {
      charactersOfSecondWord.add(secondAnagramWord.charAt(i));
    }
    return charactersOfFirstWord.containsAll(charactersOfSecondWord);
  }
}
