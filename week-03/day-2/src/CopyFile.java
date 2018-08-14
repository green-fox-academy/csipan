import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFile {
  public static void main(String[] args) throws IOException {

    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    File sourceFile = new File("C:/Users/Csipan/greenfox/csipan/week-03/day-2/my-file.txt");
    File destinationFile = new File("C:/Users/Csipan/greenfox/csipan/week-03/day-2/my2-file.txt");
    try {
      Files.copy(sourceFile.toPath(), destinationFile.toPath());
    } catch (IOException exeption) {

    }

//    String fromFile = "my-file.txt";
//    String toFile = "my2-file.txt";
//    fromFile(fromFile, toFile);
  }
//  public static v fromToFile(String fromFile, String toFile) {
//    ArrayList<String> newArray = new ArrayList<>();
//    for (int i = 0; i < number; i += 1) {
//      newArray.add(word);
//      System.out.println(newArray);
//    }
//    try {
//      Path filePath = Paths.get(path);
//      Files.write(filePath, newArray);
//      System.out.println("Everything went well :D");
//    } catch (IOException exeption) {
//      System.out.println("Unable to write file: my-file.txt");
//    }
//  }
}