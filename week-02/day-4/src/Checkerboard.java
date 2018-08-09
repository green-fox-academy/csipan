import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    graphics.setColor(Color.black);
    graphics.fillRect(0 , 0,700, 700);

    for (int x = 0; x <= 600; x += 100) {
      for (int y = 0; y <= 600; y += 100) {
        graphics.clearRect(x, y, 50, 50);
      }
    }
    for (int x = 50; x <= 650; x += 100) {
      for (int y = 50; y <= 650; y += 100) {
        graphics.clearRect(x, y, 50, 50);
      }
    }
   }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Checkerboard");
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