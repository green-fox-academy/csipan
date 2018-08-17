import javax.swing.*;

import java.awt.*;
import java.util.Random;


import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RectFractal {
  public static void mainDraw(Graphics graphics){
    int size = 600;
    int startingPositionX = 0;
    int startingPositionY = 0;
    graphics.setColor(Color.yellow);
    graphics.fillRect(startingPositionX, startingPositionY, size * 3, size * 3);

    drawFractal(startingPositionX, startingPositionY, size, graphics);
    drawRectangle(startingPositionX, startingPositionY, size, graphics);

  }

  public static void drawRectangle(int x, int y, int size, Graphics graphics) {

    graphics.setColor(Color.black);
    graphics.drawRect(x, y, size * 3, size *3);
    graphics.drawRect(x + size, y, size, size);
    graphics.drawRect(x, y + size, size, size);
    graphics.drawRect(x + size, y + 2 * size, size, size);
    graphics.drawRect(x + 2 * size, y + size, size, size);
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawRectangle(x, y, size, graphics);
    if (size > 20) {
      drawFractal(x + size, y + size / 3, size / 9, graphics);
      drawFractal(x + size * 5 / 3, y + size / 3, size / 9, graphics);
      drawFractal(x + size * 4 / 3, y, size / 9, graphics);
      drawFractal(x + size * 4 / 3, y + size * 2 / 3, size / 9, graphics);
    }
  }


  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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