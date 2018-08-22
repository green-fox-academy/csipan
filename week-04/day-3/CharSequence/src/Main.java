public class Main {
  public static void main(String[] args) {

    Gnirts example1 = new Gnirts("example1");
    System.out.println(example1.length());
    System.out.println(example1.charAt(1));
    System.out.println(example1.subSequence(1, 4));

    System.out.println();

    Shifter example2 = new Shifter("example2", 3);
    System.out.println(example2.length());
    System.out.println(example2.charAt(0));
    System.out.println(example2.subSequence(0, 3));
  }
}
