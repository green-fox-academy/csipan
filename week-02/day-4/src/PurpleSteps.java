import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

    for (int i = 0; i <= 30; i += 1) {
      int xCordinate = 0 + i * 30;
      int yCoordinate = 0 + i * 30;
      purpleSteps(xCordinate, yCoordinate, graphics);
    }

  }
  public static void purpleSteps(int xCoordinate, int yCoordinate, Graphics graphics) {
    graphics.setColor(new Color(177, 69, 243));
    graphics.fillRect(xCoordinate, yCoordinate, 30, 30);
    graphics.drawRect(xCoordinate, yCoordinate, 30, 30);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("PurpleSteps");
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