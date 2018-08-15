public class CarWithLicencePlate {
  private static int carCount = 0;
  private double fuelLevel = 0;
  private String licensePlate = "AAA-000";

  public CarWithLicencePlate(double fuelLevel) {
    if (carCount == 0) {
      licensePlate = "AAA-000";
    } else if (carCount == 1) {
      licensePlate = "AAA-001";
    } else if (carCount == 2) {
      licensePlate = "AAA-002";
    }
    carCount += 1;
    this.fuelLevel = fuelLevel;
  }
  public String getLicensePlate() {
    licensePlate = "";
    return licensePlate;
  }
}