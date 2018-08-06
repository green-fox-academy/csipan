public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    int aj[] = {3, 4, 5, 6, 7};
//    int first = aj[0];
//    int second = aj[1];
//    aj[0] = aj[4];
//    aj[1] = aj[3];
//    aj[3] = second;
//    aj[4] = first;
//     for (int i = 0; i < aj.length; i += 1) {
//       System.out.print(aj[i] + " ");
//     }

     // more efficient way
    for (int i = aj.length - 1; i >= 0; i -= 1) {
      System.out.print(aj[i] + " ");
    }
  }
}
