import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    if (args.length == 0) {
      usage();
    }

    if (args[0].equals("-l")) {
      todoRead();
    }

    if (args[0].equals("-a")) {
      List<String> content = new ArrayList<>();
      if (args.length == 1) {
        System.out.println("Unable to add: no task provided");
      } else {
        for (int i = 1; i < args.length; i++) {
          content.add(args[i]);
        }
        todoWrite(content);
      }
    }

    if (args[0].equals("-r")) {
      if (args.length != 2) {
        System.out.println("Unable to remove: no index provided or too many indexes provided");
        todoRead();
      } else {
        try {
          int index = Integer.parseInt(args[1]);
          todoDelete(index);
        } catch (NumberFormatException ex) {
          System.out.println("Unable to remove: index is not a number");
          todoRead();
        }
      }
    }

    if (!args[0].equals("-l") && !args[0].equals("-a") && !args[0].equals("-r") && !args[0].equals("-c")) {
      System.out.println("Unsupported argument. See the manual: ");
      usage();
    }
  }

  public static void usage() {
    System.out.println();
    System.out.println("COMMAND LINE TODO APPLICATION");
    System.out.println("=============================");
    System.out.println();
    System.out.println("Command line arguments:");
    System.out.println(" -l   Lists all the tasks");
    System.out.println(" -a   Adds a new task");
    System.out.println(" -r   Removes a task");
    System.out.println(" -c   Completes a task");
  }

  public static void todoRead() {
    Path getPath = Paths.get("todo.txt");
    try {
      int counter = 1;
      List<String> todo = Files.readAllLines(getPath);
      if (todo.size() == 0) {
        System.out.println("No todos for today! :)");
      }
      for (String line : todo) {
        System.out.println(counter + " - " + line);
        counter++;
      }
    } catch (Exception ex) {
      System.out.println("Your file is not readable. So Sorry...");
    }
  }

  public static void todoWrite(List<String> content) {
    Path getPath = Paths.get("todo.txt");
    try {
      Files.write(getPath, content, StandardOpenOption.APPEND);
    } catch (Exception ex) {
      System.out.println("Your file is not writeable. So Sorry...");
    }
    todoRead();
  }

  public static void todoDelete(int index) {
    Path getPath = Paths.get("todo.txt");
    try {
      List<String> todo = Files.readAllLines(getPath);
      if (index - 1 <= todo.size() - 1) {
        todo.remove(index - 1);
        Files.write(getPath, todo);
      } else {
        System.out.println("Unable to remove: index is out of bound");
      }
    } catch (Exception ex) {
      System.out.println("Your file is not writeable. So Sorry...");
    }
    todoRead();
  }
}