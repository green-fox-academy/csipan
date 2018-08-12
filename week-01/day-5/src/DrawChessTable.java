public class DrawChessTable {
  public static void main(String... args){
    String whiteSymbol = " %";
    String blackSymbol = "% ";

    for (int i = 0; i < 8; i += 1) {
      if (i % 2 == 0) {
        for (int j = 0; j < 4; j += 1) {
          System.out.print(whiteSymbol);
        }
        System.out.println(whiteSymbol);
      }
      else {
        for (int j = 0; j < 4; j += 1) {
          System.out.print(blackSymbol);
        }
        System.out.println(blackSymbol);
      }
    }
  }
}
