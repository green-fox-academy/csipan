public class Main {
  public static void main(String[] args) {
    Helicopter helicopter = new Helicopter("Black Hawk", "black", "4800 kgs.");
    Bird bird = new Bird("Red-tailed Hawk", "brown", "1 kgs");

    System.out.println("What are your characteristics?");
    System.out.println("I am a " + helicopter.color + " " + helicopter.name + " with a weight of " + helicopter.weight + " I take off "
      + helicopter.takeOff() + ", fly " + helicopter.fly() + " with a maximum of " + helicopter.maxSpeed() + " km/h"
      + " and landing " + helicopter.land());
    System.out.println("I am a " + bird.color + " " + bird.name + " with a weight of " + bird.weight + " I take off "
      + bird.takeOff() + ", fly " + bird.fly() + " with a maximum of " + bird.maxSpeed() + " km/h"
      + " and landing " + bird.land());
  }
}
