import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void checkTwoWords() {
    String firstWord = "toronymorgas";
    String secondWord = "gyomorrontas";
    assertEquals(true, Anagram.checkIfAnagram(firstWord, secondWord));
  }

}