public class AppMusic {


  public static void main(String[] args) {

    System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
    ElectricGuitar guitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();

    System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
//    ElectricGuitar guitar2 = new ElectricGuitar(7);
//    BassGuitar bassGuitar2 = new BassGuitar(5);
//
    System.out.println("Test 2 Play");
//    guitar2.play();
//    bassGuitar2.play();
//  }
//
//    ElectricGuitar alma = new ElectricGuitar();
//    System.out.println(alma.numberOfStrings);
//    alma.play();
//
//    Violin korte = new Violin();
//    System.out.println(korte.name);
//    System.out.println(korte.numberOfStrings);
//    korte.play();
//    korte.sound();
//
//    BassGuitar szilva = new BassGuitar();
//    System.out.println(szilva.name);
//    System.out.println(szilva.numberOfStrings);
//    szilva.play();
  }
}