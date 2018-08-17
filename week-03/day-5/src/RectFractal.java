import javax.swing.*;

import java.awt.*;
import java.util.Random;


import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RectFractal {
  public static void mainDraw(Graphics graphics){
    int size = 1000;
    int startingPositionX = 10;
    int startingPositionY = 10;

    drawFractal(startingPositionX, startingPositionY, size, graphics);
  }

  public static void drawRectangle(int x, int y, int size, Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.fillRect(x, y, size, size);
    graphics.setColor(Color.black);
    graphics.drawRect(x, y, size, size);

  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawRectangle(x, y, size, graphics);
    if (size > 10) {
      drawFractal(x, y + size / 3, size / 3, graphics);
      drawFractal(x + size * 2 / 3, y + size / 3, size / 3, graphics);
      drawFractal(x + size * 1 / 3, y, size / 3, graphics);
      drawFractal(x + size * 1 / 3, y + size * 2 / 3, size / 3, graphics);

    }
  }


  // Don't touch the code below
  static int WIDTH = 620;
  static int HEIGHT = 643;

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
      RectFractal.mainDraw(graphics);
    }
  }
}