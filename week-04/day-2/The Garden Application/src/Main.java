public class Main {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    Flower szegfu = new Flower("blue");
    Flower margareta = new Flower("white");
    myGarden.addPlant(szegfu);
    myGarden.addPlant(margareta);
    myGarden.info();
    myGarden.watering(40);
    myGarden.info();
  }
}
