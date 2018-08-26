import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void gardenInfo() {
    System.out.println("This garden has: " + garden.size() + " plants.");
    for (int i = 0; i < garden.size() ; i++) {
      System.out.println("This garden has: " + garden.get(i).color + " " + garden.get(i).whatKindOfPlant() +
      " with a water level of: " + garden.get(i).currentWaterLevel + ". Does it need water? " + garden.get(i).ifWaterNeeded());
    }
  }

  public void addPlant(Plant plant) {
    this.garden.add(plant);
  }

  public void watering(int water) {
    int howManyPlantsNeedWater = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).ifWaterNeeded() == "Yes") {
        howManyPlantsNeedWater += 1;
      }
    }
    for (int i = 0; i < garden.size() ; i++) {
      if (garden.get(i).ifWaterNeeded() == "Yes") {
        garden.get(i).currentWaterLevel += (water / howManyPlantsNeedWater) * garden.get(i).absorbtionOfWater;
      }
    }
  }
}
