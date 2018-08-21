import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void info() {
    System.out.println("This garden has " + garden.size() + " plants.");
    for (int i = 0; i < garden.size(); i += 1) {
      System.out.println("This is a: " + garden.get(i).color + " " + garden.get(i).whatKindOfPlant() + ". It's water " +
          "level is: " + garden.get(i).waterLevel + ". Does it need water? " + garden.get(i).needWater());
    }
  }

  public void addPlant(Plant plant) {
    this.garden.add(plant);
  }

  public void watering (int water) {
    int counterForWater = 0;
    for (int i = 0; i < garden.size(); i += 1) {
      if (garden.get(i).needWater()) {   //megnézi, hogy kell-e viz neki vagy nem
        counterForWater += 1;
      }
    }
    for (int i = 0; i < garden.size(); i += 1) {  //menjen végig a kert résztvevőin
      if (garden.get(i).needWater()) {
        garden.get(i).waterLevel += water / counterForWater;
      }
    }

  }
}
