public class Main {
  public static void main(String[] args) {
    Animal firstAnimal = new Animal();
    firstAnimal.name = "Szegfű";
    System.out.println(firstAnimal.name);

    for (int i = 0; i < 50; i += 1) {
      firstAnimal.eat();
      firstAnimal.drink();
    }
    firstAnimal.play();
    System.out.println("Hunger and thirst level is: " + firstAnimal.hunger + ", " + firstAnimal.thirst);
  }
}
