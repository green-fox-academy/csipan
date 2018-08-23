public class Anagram {
  String secondAnagramWord = "gyomorrontas";
  String firstAnagramWord = "toronymorgas";

  public static boolean checkIfAnagram (String firstAnagramWord, String secondAnagramWord) {
    if (firstAnagramWord.length() == secondAnagramWord.length()) {
      for (int i = 0; i < firstAnagramWord.length(); i += 1) {
        for (int j = 0; j < secondAnagramWord.length(); j += 1) {
          if (firstAnagramWord.charAt(i) == secondAnagramWord.charAt(j)) {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }
}
