public class ChangeElement {
  public static void main(String[] args) {
//    # - Create an array variable named `s`
//    #   with the following content: `[1, 2, 3, 8, 5, 6]`
//    # - Change the 8 to 4
//    # - Print the fourth element

    int s[] = {1, 2, 3, 8, 5, 6};
    s[3] = 4;
    System.out.println(s[3]);

    // if you want to write out the whole array
    for (int i = 0; i < s.length; i += 1) {
      if (i < s.length - 1){
        System.out.print(s[i] + ", ");
      }
      else {
        System.out.print(s[i]);
      }
    }

  }
}
