import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    String path = "c:/Users/Csipan/greenfox/csipan/week-03/day-2/log.txt";
    Path getPath = Paths.get(path);
    try {
      List<String> lines = Files.readAllLines(getPath);
      System.out.println(uniqIP(lines));
      System.out.println(ratioGetPost(lines));
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + path);
    }
  }

  private static double ratioGetPost(List<String> lines) {
    double get = 0;
    double post = 0;
    List<String> getpost = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      getpost.add(lines.get(i).split("   ")[2]);
      if (getpost.get(i).contains("POST")) {
        post += 1;
      }
      else if (getpost.get(i).contains("GET")) {
        get += 1;
      }
    }
    double ratio = get / post;
    return ratio;
  }

  public static ArrayList uniqIP(List<String> lines) {
    ArrayList<String> IPs = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      String IP = lines.get(i).split("   ")[1];
      if (!IPs.contains(IP)) {
        IPs.add(IP);
      }
    }
    return IPs;
  }
}
