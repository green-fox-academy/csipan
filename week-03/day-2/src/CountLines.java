import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    List<String> content = new ArrayList<>();
    content.add("Most mar johetsz a Madarasi hargitara is :)");

    try {
      Path filePath = Paths.get("my-file.txt");
      Files.write(filePath, content);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
