public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String myTodo = "My todo: \n";
    todoText = todoText.concat(" - Download games \n" + "     - Diablo");
    System.out.println(myTodo + todoText);
  }
}