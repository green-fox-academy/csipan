public class SumAll {
  public static void main(String[] args) {
    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`

    int ai[] = {3, 4, 5, 6, 7};
//    int sum = ai[0] + ai[1] + ai[2] + ai[3] + ai[4];
//    System.out.println(sum);
    int sum = 0;
    for (int i = 0; i < ai.length; i += 1) {
      sum += ai[i];
    }
    System.out.println(sum);
  }
}
