public class PrintParams {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...

    printParams("kecske", "tetu", "beka");
  }
  public static void printParams(String ...a){ //azért kell void, mert nem fog visszaküldeni semmi adatot. és a három pont a jelzi, hogy a bevitt szavak száma bármekkora lehet
    for (String i : a) {  //addig végezze el a müveletet, vagy vegye be az adatokat, amíg talál paramétert
      System.out.print(i + " ");
//    System.out.println();  // ha ez itt van, akkor minden szót új sorba tesz
    }
  }
}
