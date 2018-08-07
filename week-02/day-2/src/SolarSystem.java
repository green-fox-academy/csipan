import java.util.*;

public class SolarSystem{
  public static void main(String... args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.

//    you can resolve the problem this way

//    planetList.add("Saturn");
//    System.out.println(planetList);

//    putSaturn(planetList) = planetList + putSaturn();
//    System.out.println(putSaturn(planetList));

    System.out.println(putSaturn(planetList));
  }
  //  készítek egy arraylistet, amit tartalmazza a Saturnból álló listát és hozzá adja a planetList-hez
//  public static ArrayList putSaturn(ArrayList addSaturn) {
//      addSaturn.add(5,"Saturn");    // az indexxel megmondom, hogy hová adja hozzá a Saturnot
//      return addSaturn;
//    }

  public static ArrayList<String> putSaturn(ArrayList<String> addSaturnAndPluto) {
    String saturn = "Saturn";
    String pluto = "Pluto";
    addSaturnAndPluto.add(5, saturn);
    addSaturnAndPluto.add(pluto);
    return addSaturnAndPluto;

  }

//    System.out.println(putSaturn(planetList));
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
}