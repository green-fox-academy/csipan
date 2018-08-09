import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int x = 0;
    int y = 0;
    for (x = 0; x <= WIDTH; x += 20) {
      graphics.setColor(Color.red);
        graphics.drawLine(x, 0, WIDTH / 2, HEIGHT / 2);
    }
    for (y = 0; y <= WIDTH; y += 20) {
      graphics.setColor(Color.red);
      graphics.drawLine(0, y, WIDTH / 2, HEIGHT / 2);
    }
    for (y = WIDTH ; y >= 0; y -= 20) {
      graphics.setColor(Color.red);
      graphics.drawLine(WIDTH, y, WIDTH / 2, HEIGHT / 2);
    }
    for (x = WIDTH ; x >= 0; x -= 20) {
      graphics.setColor(Color.red);
      graphics.drawLine(x, HEIGHT, WIDTH / 2, HEIGHT / 2);
    }
    drawingToCentre(graphics);
  }
  public static void  drawingToCentre(Graphics graphics) {
    graphics.drawLine(WIDTH, HEIGHT, WIDTH, HEIGHT);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("FunctionToCenter");
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