public class Car {
  private double fuelLevel = 0;
  private String licensePlate = "AAA-000";

  public Car(int index, double fuelLevel) {
    if (index == 1) {
      licensePlate = "AAA-000";
    } else if (index == 2) {
      licensePlate = "AAA-001";
    } else if (index == 3) {
      licensePlate = "AAA-002";
    }
    this.fuelLevel = fuelLevel;
  }
  public String getLicensePlate() {
    licensePlate = "";
    return licensePlate;
  }
}
