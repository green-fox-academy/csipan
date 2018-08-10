import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

    int coordinate = 0;
    int size = 2;
    for (int i = 1; i <= 30; i += 1) {
      size *= 2;
      coordinate = size;
      purpleSteps(coordinate, size, graphics);
    }

  }
  public static void purpleSteps(int coordinate, int size, Graphics graphics) {
    graphics.setColor(new Color(177, 69, 243));
    graphics.fillRect(coordinate, coordinate, size, size);
    graphics.setColor(Color.black);
    graphics.drawRect(coordinate, coordinate, size, size);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("PurpleSteps3d");
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