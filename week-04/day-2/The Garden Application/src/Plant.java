public class Plant {

  String name;
  double absorb;
  double waterLevel;
  String color;
  double waterNeed;

  public Plant(String color) {
    this.color = color;
    waterLevel = 0;
  }

  public boolean needWater() {
    return  (waterLevel < waterNeed);
  }

  public String whatKindOfPlant() {
    if (this instanceof Flower) {
      return "flower";
    }
    else {
      return "tree";
    }
  }
}
