import javax.swing.*;

import java.awt.*;
//import java.util.Random;


//import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){

    int size = 200;
    int startingPositionX = 200;
    int startingPositionY = 200;
    int[] frameTriangleX = {startingPositionX - size / 2, startingPositionX + size + size * 1 / 2, startingPositionX + size / 2};
    int[] frameTriangleY = {startingPositionY - ((int)(size *Math.sqrt(3)) / 2) , startingPositionY - ((int)(size *Math.sqrt(3)) / 2), startingPositionY + ((int)(size *Math.sqrt(3)) / 2) + 1 / 2 *size};
    graphics.setColor(Color.black);
    graphics.drawPolygon(frameTriangleX, frameTriangleY,3);
    drawTriangle(startingPositionX, startingPositionY, size, graphics);
    drawFractal(startingPositionX, startingPositionY, size, graphics);
  }

  public static void drawTriangle(int x, int y, int size, Graphics graphics) {
    int[] triangleX = {x, x + size, x + size * (int)(Math.sqrt(3)) / 2};
    int[] triangleY = {y, y, y - (int)(size * Math.sqrt(3)) / 2};
    graphics.setColor(Color.black);
    graphics.drawPolygon(triangleX, triangleY,3);

  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawTriangle(x, y, size, graphics);
    if (size > 10) {
      drawFractal(x - size / 4, y - ((int)(size *Math.sqrt(3)) / 2 / 2), size / 2, graphics);
      drawFractal(x + size * 3 / 4, y - ((int)(size *Math.sqrt(3)) / 2 / 2), size / 2, graphics);
      drawFractal(x + size / 4, y + ((int)(size *Math.sqrt(3)) / 2 / 2), size / 2, graphics);
    }
  }


  // Don't touch the code below
  static int WIDTH = 620;
  static int HEIGHT = 643;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Triangle");
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