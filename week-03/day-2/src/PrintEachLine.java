import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) throws IOException {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"


//    try {
      Path filePath = Paths.get("c:\\Users\\Csipan\\greenfox\\csipan\\week-03\\day-2\\my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(0));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}