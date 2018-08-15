public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing first = new Thing("Get milk");                //megmondom, hogy milyen szöveget addok hozzá elsőként
    fleet.add(first);                                         //effectív hozzá is adom

    Thing second = new Thing("Remove the obstacles");
    fleet.add(second);

    Thing third = new Thing("Stand up");
    fleet.add(third);
    third.complete();                                         //jelzem, hogy ez task el van végezve

    Thing four = new Thing("Eat lunch");
    fleet.add(four);
    four.complete();

    System.out.println(fleet);
  }
}