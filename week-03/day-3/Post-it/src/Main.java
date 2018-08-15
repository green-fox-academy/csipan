public class Main {

  public static void main(String[] args) {
    // write your code here

    PostIt one = new PostIt();
    one.backgroundColor = "orange";
    one.textColor = "blue";
    one.text = "Idea 1";
    System.out.println(one.backgroundColor);
    System.out.println(one.text);
    System.out.println(one.textColor);

    PostIt two = new PostIt();
    two.text = "Awesome";
    two.textColor = "black";
    two.backgroundColor = "pink";

    PostIt three = new PostIt();
    three.backgroundColor = "yellow";
    three.textColor = "green";
    three.text = "Superb";
  }
}
