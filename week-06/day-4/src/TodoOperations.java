import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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
    for (int i = 0; i < userInputs.length ; i++) {
      userInput.add(userInputs[i]);
    }
  }

  public void add(Todos todo) {
    todoList.add(todo);
  }

  public void load() {

  }

  public String toString() {
    String result = "";
    for (int i = 0; i < todoList.size() ; i++) {
      result += (i + 1) + " - " + todoList.get(i).toString() + "\n";
    }
    return result;
  }
}
