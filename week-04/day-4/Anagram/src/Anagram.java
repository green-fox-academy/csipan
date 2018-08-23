public class Anagram {
  String secondAnagramWord;
  String firstAnagramWord;

  public boolean checkIfAnagram () {
    for (int i = 0; i < anaramWord.length(); i += 1) {
      if (anaramWord.charAt(0) == anaramWord.charAt(i)) {
        return true;
      }
    }
    return false;
  }
}
