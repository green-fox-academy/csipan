import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

//    int width;
//    int height;
//    for (int i = 1; i <= 3; i += 1) {
//      width = (int) (Math.random() * 350);
//      height = (int) (Math.random() * 350);
//      centerBox(width, height, graphics);
//    }

//    int size = (int) (Math.random() * 250);  //if it is outside of the for loop maybe it is not working or it does not draw 3 squares
    for (int i = 1; i <= 3; i += 1) {
      int size = (int) (Math.random() * 250);
      centerBox(size, graphics);
    }
  }
  public static void centerBox(int size, Graphics graphics) {
    graphics.setColor(Color.red);
    graphics.drawRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
  }

//  public static void centerBox(int width, int height, Graphics graphics) {
//    graphics.setColor(Color.red);
//    graphics.drawRect(WIDTH / 2 - width / 2, HEIGHT / 2 - height / 2, width, height);
//  }


//  public static void centerBoxFunction(int x, Graphics graphics); {

//      }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("CenterBoxFunction");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}