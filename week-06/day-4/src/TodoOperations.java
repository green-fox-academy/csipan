import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoOperations {
  private ArrayList<Todos> todoList;
  private Path getPath;
  private ArrayList<String> userInput;

  public TodoOperations() {
    todoList = new ArrayList<>();
    getPath = Paths.get("todo.txt");
    userInput = new ArrayList<>();
  }

  public void userInputIntoList(String[] userInputs) {
    for (int i = 0; i < userInputs.length; i++) {
      userInput.add(userInputs[i]);
    }
  }

  public void doOneThingWithTodos() {
    if (userInput.size() == 0) {
      usageInfo();
    } else {
      if (userInput.get(0).equals("-l")) {
        justRead();
      }
      if (userInput.get(0).equals("-a")) {
        addTodo();
      }
      if (userInput.get(0).equals("-r")) {
        deleteTodo();
      }
      if (userInput.get(0).equals("-c")) {
        completeTodo();
      }
      if (!userInput.get(0).equals("-l") && !userInput.get(0).equals("-a") && !userInput.get(0).equals("-r") && !userInput.get(0).equals("-c")) {
        System.out.println("Unsupported argument. See the manual: ");
        usageInfo();
      }
    }
  }

  public void readFromFileToTodoList() {
    try {
      List<String> lines = Files.readAllLines(getPath);
      for (int i = 0; i < lines.size(); i++) {
        Todos todo = new Todos(lines.get(i));
        todoList.add(todo);
      }
    } catch (Exception ex) {
      System.out.println("Your file is not readable. So Sorry...");
    }
  }

  public void writeFromTodoListToFile() {
    ArrayList<String> linesToWrite = new ArrayList<>();
    if (todoList.size() != 0) {
      for (int i = 0; i < todoList.size(); i++) {
        linesToWrite.add(todoList.get(i).getName());
      }
    }
    try {
      Files.write(getPath, linesToWrite);
    } catch (Exception ex) {
      System.out.println("File is not writeable, sorry master...");
    }
  }

  public void printTodoList() {
    String result = "";
    for (int i = 0; i < todoList.size(); i++) {
      todoList.get(i).setId(i + 1);
      result += todoList.get(i).toString();
    }
    System.out.println(result);
  }

  public void justRead() {
    readFromFileToTodoList();
    if (todoList.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      printTodoList();
    }
  }

  public void addTodo() {
    if (userInput.size() == 1) {
      System.out.println("Unable to add: no task provided");
    } else {
      readFromFileToTodoList();
      for (int i = 1; i < userInput.size(); i++) {
        Todos todo = new Todos(userInput.get(i));
        todoList.add(todo);
      }
      writeFromTodoListToFile();
      printTodoList();
    }
  }

  public void deleteTodo() {
    if (userInput.size() != 2) {
      System.out.println("Unable to remove: no index provided or too many indexes provided");
      printTodoList();
    } else {
      try {
        int index = Integer.parseInt(userInput.get(1));
        readFromFileToTodoList();
        if (index - 1 <= todoList.size() - 1) {
          todoList.remove(index - 1);
          writeFromTodoListToFile();
        } else {
          System.out.println("Unable to remove: index is out of bound");
        }
        printTodoList();
      } catch (NumberFormatException ex) {
        System.out.println("Unable to remove: index is not a number");
      }
    }
  }

  public void completeTodo() {
    readFromFileToTodoList();
    if (todoList.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      try {
        int index = Integer.parseInt(userInput.get(1));
        if (index - 1 <= todoList.size() - 1) {
          todoList.get(index - 1).setCompleted(true);
          writeFromTodoListToFile();
        } else {
          System.out.println("Unable to complete: index is out of bound");
        }
        printTodoList();
      } catch (NumberFormatException ex) {
        System.out.println("Unable to complete: index is not a number");
      }
    }
  }

  public void usageInfo() {
    System.out.println();
    System.out.println("COMMAND LINE TODO APPLICATION");
    System.out.println("=============================");
    System.out.println();
    System.out.println("Command line arguments:");
    System.out.println(" -l   Lists all the tasks");
    System.out.println(" -a   Adds new task(s)");
    System.out.println(" -r   Removes a task");
    System.out.println(" -c   Completes a task");
  }
}