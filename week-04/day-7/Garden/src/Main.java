public class Main {
  public static void main(String[] args) {

    Garden myGarden = new Garden();
    Flower carnation = new Flower("white");
    Flower rose = new Flower("red");
    Tree oak = new Tree("light green");
    Tree pine = new Tree("dark green");

    myGarden.addPlant(carnation);
    myGarden.addPlant(rose);
    myGarden.addPlant(oak);
    myGarden.addPlant(pine);
    myGarden.gardenInfo();

    myGarden.watering(40);
    myGarden.gardenInfo();

    myGarden.watering(70);
    myGarden.gardenInfo();
  }
}
