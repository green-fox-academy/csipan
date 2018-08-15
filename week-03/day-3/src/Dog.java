public class Dog {
  private  int belly = 0;
  public int moodLevel = 0;
  String name = "Good Boy";

  public void eat() {
    belly += 1;
  }

  public void barkHowAreYou() {
    System.out.println("My belly is: " + belly);
  }
}
