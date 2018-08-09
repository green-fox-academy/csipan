import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 1 parameter:
    // An array of {x, y} points
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int xpoints_box[] = {10, 290, 290, 10};
    int ypoints_box[] = {10, 10, 290, 290};
    int box_points = xpoints_box.length;
    connectTheDots(xpoints_box, ypoints_box, box_points, graphics);

    int xpoints_anything[] = {50, 70, 80, 90, 100, 120, 85, 50};
    int ypoints_anything[] = {100, 70, 90, 90, 70, 100, 130, 100};
    int anything_points = xpoints_anything.length;
    connectTheDots2(xpoints_anything, ypoints_anything, anything_points, graphics);
  }

  public static void connectTheDots(int xpoint_box[], int ypoints_box [], int box_points, Graphics graphics) {
    graphics.setColor(Color.green);
    graphics.drawPolygon(xpoint_box, ypoints_box, box_points);
  }

  public static void connectTheDots2(int xpoints_anything[], int ypoints_anything[], int anything_points, Graphics graphics) {
    graphics.setColor(Color.green);
    graphics.drawPolygon(xpoints_anything, ypoints_anything, anything_points);
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("ConnectTheDots");
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


// create a 300x300 canvas.