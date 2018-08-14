import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

//    List<String> content = new ArrayList<>();
//    content.add("Most mar johetsz a Madarasi hargitara is :)");
    String fileName = "my-file.txt";
    numberOfLines(fileName);
  }
   public static void numberOfLines(String fileName) {
      try {
        Path filePath = Paths.get("my-file.txt");
        List<String> lines = Files.readAllLines(filePath);
        System.out.println(lines.size());
      } catch (IOException e) {
        e.printStackTrace();
        System.out.println(0);
      }
     }
}
