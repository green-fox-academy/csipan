import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
  public static void main(String[] args) throws IOException {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    String path = "my-file.txt";
    String word = "Apple";
    int number = 5;
    threeParameters(path, word, number);
  }
  public static void threeParameters(String path, String word, int number) {
    ArrayList<String> newArray = new ArrayList<>();
    for (int i = 0; i < number; i += 1) {
      newArray.add(word);
      System.out.println(newArray);
    }
    try {
      Path filePath = Paths.get(path);
      Files.write(filePath, newArray);
      System.out.println("Everything went well :D");
    } catch (IOException exeption) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
