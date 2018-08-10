import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    int xPurple1 = 0;
    int yPurple1 = 0;
    int xPurple2 = 300;
    int yPurple2 = 20;
    for (int i = 20; i < 290; i += 20) {
        xPurple1 = i;
        yPurple2 = i;
        linePlayPurple(i, yPurple1, xPurple2, i, graphics);
    }

    int xGreen1 = 0;
    int yGreen1 = 300;
    int xGreen2 = 300;
    int yGreen2 = 300;
    for (int i = 290; i > 0; i -= 20) {
      yGreen1 = i;
      xGreen2 = i;
      linePlayGreen(xGreen1, i, i, yGreen2, graphics);
    }
  }
  public static void linePlayPurple(int x1, int y1, int x2, int y2, Graphics graphics) {
    graphics.setColor(new Color(177, 69, 243));
    graphics.drawLine(x1, y1, x2, y2);
  }
  public static void linePlayGreen(int x1, int y1, int x2, int y2, Graphics graphics) {
    graphics.setColor(Color.green);
    graphics.drawLine(x1, y1, x2, y2);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
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
