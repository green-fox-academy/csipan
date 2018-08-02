public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    double h = 10;
    double w = 10;
    double d = 10;
    System.out.println("The cuboid surface area is: " + (2 * ((h * w) + (h * d) + (d * w))));
    System.out.println("The cuboid volume is: " + (h * w * d));

    double surfaceArea = 2 * ((h * w) + (h * d) + (d * w));
    double volume = h * w * d;
    System.out.println("The cuboid surface area is: " + surfaceArea);
    System.out.println("The cuboid volume is: " + volume);
  }
}
