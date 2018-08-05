public class IWontCheatOnTheExams {
  public static void main(String[] args) {
    // Create a program that writes this line 100 times:
    // "I won't cheat on the exam!"

    int numberCheat1 = 0;
    while (numberCheat1 < 6) {
      System.out.println("I won't cheat on the exam!");
      // both way is working
//      numberCheat1 ++;
      numberCheat1 += 1;
    }

    // Let's see another option with for loop
    for (int numberCheat2 = 0; numberCheat2 < 7; numberCheat2 += 1) {
      System.out.println("I won't cheat on the exam!");
    }
  }
}
