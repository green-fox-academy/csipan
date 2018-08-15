import java.util.HashMap;
import java.util.Map;

public class MaterialReview {
  public static void main(String[] args) {
    // Not object oriented solution
    Map<String, Integer> dog = new HashMap<>();
    dog.put("belly", 0);
    System.out.println(dog);
    feed(dog);
    System.out.println(dog);

    //Object oriented (OO) solution
    Dog morzsi = new Dog();
    morzsi.eat();
    morzsi.barkHowAreYou();
    morzsi.moodLevel = 4;
    System.out.println("Morzsi-s mood level is: " + morzsi.moodLevel);

    Car trabant = new Car(2, 1);
    System.out.println(trabant.getLicensePlate());

    Car skoda = new Car(3, 2);
    System.out.println(skoda.getLicensePlate());

//    CarWithLicencePlate.carCount = 5;
    CarWithLicencePlate trabi2 = new CarWithLicencePlate(20);
    CarWithLicencePlate trabi3 = new CarWithLicencePlate(40);
    System.out.println(trabi2.getLicensePlate());
    System.out.println(trabi3.getLicensePlate());
  }

  public static void  feed(Map<String, Integer> dog) {
    dog.put("belly", dog.get("belly") + 1);
  }
}
