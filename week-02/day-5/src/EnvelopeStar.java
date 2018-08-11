import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    int xGreen11 = 300;
    int yGreen11 = 0;
    int xGreen12 = 300;
    int yGreen12 = 300;
    for (int i = 0; i < 290; i += 20) {
      xGreen12 = 300 + i;
      graphics.setColor(Color.green);
      graphics.drawLine(xGreen11, i, xGreen12, yGreen12);
    }

    int xGreen21 = 0;
    int yGreen21 = 300;
    int xGreen22 = 300;
    int yGreen22 = 320;
    for (int i = 20; i <= 300; i += 20) {
      yGreen22 = 300 + i;
      graphics.setColor(Color.green);
      graphics.drawLine(i, yGreen21, xGreen22, yGreen22);
    }

    int xGreen31 = 0;
    int yGreen31 = 300;
    int xGreen32 = 300;
    int yGreen32 = 280;
    for (int i = 20; i <= 300; i += 20) {
      yGreen32 = 300 - i;
      graphics.setColor(Color.green);
      graphics.drawLine(i, yGreen31, xGreen32, yGreen32);
    }

    int xGreen41 = 300;
    int yGreen41 = 320;
    int xGreen42 = 600;
    int yGreen42 = 300;
    for (int i = 20; i <= 300; i += 20) {
      yGreen41 = 300 + i;
      xGreen42 = 600 - i;
      graphics.setColor(Color.green);
      graphics.drawLine(xGreen41, yGreen41, xGreen42, yGreen42);
    }
  }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("EnvelopeStar");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
