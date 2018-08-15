import java.util.Arrays;

public class DiceSet {
  // You have a `DiceSet` class which has a list for 6 dices
  // You can roll all of them with roll()
  // Check the current rolled numbers with getCurrent()
  // You can reroll with reroll()
  // Your task is to roll the dices until all of the dices are 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
//    DiceSet diceSet = new DiceSet();
//    diceSet.getCurrent();
//    diceSet.roll();
//    diceSet.getCurrent();
//    diceSet.getCurrent(5);
//    diceSet.reroll();
//    diceSet.getCurrent();
//    diceSet.reroll(4);
//    diceSet.getCurrent();

    DiceSet myDices = new DiceSet();                      //létrehoztam a saját kocka dobásaimat
    myDices.roll();                                       //egyet dobtam a kockával
    for (int i = 0; i < myDices.getCurrent().length;) {   //megnézem a dobások eredményét
      if (myDices.getCurrent(i) != 6) {                   //hogyha megnézi a kockákat és valamelyik nem hatos
        myDices.reroll(i);                                //akkor újra dob az adott kockával
      }
      else {
        i += 1;                                           //ha hatos menjen tovább és nézze meg a következő kockát
      }
    }
    for (int j = 0; j < myDices.getCurrent().length; j += 1) {    //most össze kell gyűjtenem a 6-os kockákat
      System.out.println(myDices.getCurrent()[j]);                //s ki kell íratnom minden egyeset
    }
  }
}