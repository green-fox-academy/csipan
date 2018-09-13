public class Main {

  public static void main(String[] args) {

    TodoOperations todoOperations = new TodoOperations();
    todoOperations.userInputIntoList(args);
    todoOperations.doOneThingWithTodos();
  }
}