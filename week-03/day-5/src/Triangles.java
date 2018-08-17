import javax.swing.*;

import java.awt.*;
import java.util.Random;


import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){
    int size = 200;
    int startingPositionX = 50;
    int startingPositionY = 50;
    drawTriangle(startingPositionX, startingPositionY, size, graphics);
//    drawFractal(startingPositionX, startingPositionY, size, graphics);
  }

  public static void drawTriangle(int x, int y, int size, Graphics graphics) {
    int[] triangleX = {x, x + size, size * (int)(Math.sqrt(3)) / 2};
    int[] triangleY = {y, y + size, size * (int)(Math.sqrt(3)) / 2};
    graphics.setColor(Color.black);
    graphics.drawPolygon(triangleX, triangleY,3);

  }

//  public static void drawFractal(int x, int y, int size, Graphics graphics) {
//    drawTriangle(x, y, size, graphics);
//    if (size > 10) {
//      drawFractal(x, y + size / 3, size / 3, graphics);
//      drawFractal(x + size * 2 / 3, y + size / 3, size / 3, graphics);
//      drawFractal(x + size * 1 / 3, y, size / 3, graphics);
//      drawFractal(x + size * 1 / 3, y + size * 2 / 3, size / 3, graphics);
//
//    }
//  }


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