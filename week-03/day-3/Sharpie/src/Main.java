public class Main {
  public static void main(String[] args) {


    Sharpie sharpie = new Sharpie("black", 25, 75);
    Sharpie sharpie1 = new Sharpie("yellow", 22, 69);

//    sharpie.color = "black";
//    sharpie.width = 25;
    if (sharpie.width > 20 ) {
      sharpie.use();
      sharpie1.use();
    }
    System.out.println("The sharpie color is: " + sharpie.color + ", " + sharpie.width + " width and the ink amount is: " + sharpie.inkAmount);
    System.out.println("The sharpie color is: " + sharpie1.color + ", " + sharpie1.width + " width and the ink amount is: " + sharpie1.inkAmount);
  }
}
