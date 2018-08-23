import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void checkTwoWords() {
    String firstWord = "toronymorgas";
    String secondWord = "gyomorrontas";
    assertTrue(Anagram.checkIfAnagram(firstWord, secondWord));
  }

}