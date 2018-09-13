public class Todos {
  private String name;
  private boolean completed;
  private int id;

  public Todos(String name) {
    this.name = name;
    this.completed = false;
    this.id = 1;
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return completed;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String toString() {
    return id + " " + (completed ? "[x] " : "[ ] ") + " " + name;
  }
}
