import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int xPurple1 = 0;
    int yPurple1 = 0;
    int xPurple2 = 300;
    int yPurple2 = 20;
    for (int i = 20; i < 290; i += 20) {
      xPurple1 = i;
      yPurple2 = i;
      graphics.setColor(new Color(177, 69, 243));
      graphics.drawLine(i, yPurple1, xPurple2, i);
    }

    int xGreen1 = 0;
    int yGreen1 = 300;
    int xGreen2 = 300;
    int yGreen2 = 300;
    for (int i = 290; i > 0; i -= 20) {
      yGreen1 = i;
      xGreen2 = i;
      graphics.setColor(Color.green);
      graphics.drawLine(xGreen1, i, i, yGreen2);
    }


    int xPurple21 = 300;
    int yPurple21 = 300;
    int xPurple22 = 600;
    int yPurple22 = 320;
    for (int i = 320; i < 590; i += 20) {
      xPurple21 = i;
      yPurple22 = i;
      graphics.setColor(new Color(177, 69, 243));
      graphics.drawLine(i, yPurple21, xPurple22, i);
    }

    int xGreen21 = 300;
    int yGreen21 = 600;
    int xGreen22 = 600;
    int yGreen22 = 600;
    for (int i = 590; i > 300; i -= 20) {
      yGreen21 = i;
      xGreen22 = i;
      graphics.setColor(Color.green);
      graphics.drawLine(xGreen21, i, i, yGreen22);
    }

    int xPurple31 = 300;
    int yPurple31 = 0;
    int xPurple32 = 600;
    int yPurple32 = 20;
    for (int i = 20; i < 290; i += 20) {
      xPurple31 = 300 + i;
      graphics.setColor(new Color(177, 69, 243));
      graphics.drawLine(xPurple31, yPurple31, xPurple32, i);
    }

    int xGreen31 = 300;
    int yGreen31 = 0;
    int xGreen32 = 300;
    int yGreen32 = 300;
    for (int i = 20; i < 290; i += 20) {
      xGreen32 = 300 + i;
      graphics.setColor(Color.green);
      graphics.drawLine(xGreen31, i, xGreen32, yGreen32);
    }

    int xPurple41 = 0;
    int yPurple41 = 300;
    int xPurple42 = 300;
    int yPurple42 = 320;
    for (int i = 20; i < 290; i += 20) {
      yPurple42 = 300 + i;
      graphics.setColor(new Color(177, 69, 243));
      graphics.drawLine(i, yPurple41, xPurple42, yPurple42);
    }

    int xGreen41 = 0;
    int yGreen41 = 300;
    int xGreen42 = 20;
    int yGreen42 = 600;
    for (int i = 20; i < 290; i += 20) {
      yGreen41 = 300 + i;
      graphics.setColor(Color.green);
      graphics.drawLine(xGreen41, yGreen41, i, yGreen42);
    }
  }
//  public static void linePlayPurple(int x1, int y1, int x2, int y2, Graphics graphics) {
//    graphics.setColor(new Color(177, 69, 243));
//    graphics.drawLine(x1, y1, x2, y2);
//  }
//  public static void linePlayGreen(int x1, int y1, int x2, int y2, Graphics graphics) {
//    graphics.setColor(Color.green);
//    graphics.drawLine(x1, y1, x2, y2);
//  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("LinePlayQuarters");
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
