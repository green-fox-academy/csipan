public class Plant {

  String name;
  double currentWaterLevel;
  String color;
  double waterNeed;
  double absorbtionOfWater;

  public Plant(String color) {
    this.color = color;
    currentWaterLevel = 0;
  }

  public String ifWaterNeeded() {
    if (currentWaterLevel < waterNeed) {
      return "Yes";
    }
    else {
      return "N o";
    }

  }

  public String whatKindOfPlant() {
    if (this instanceof Flower) {
      return "flower";
    }
    return "tree";
  }

}
