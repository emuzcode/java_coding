// Output 10 input strings

class Sample3 {
  public static void main(String[] args) {
    String input = "a a a a a a a a a a";

    String[] ans = input.split(" ");
    for (int i = 0; i < 10; i++) {
      // ans[i] = input.split(" ");
      System.out.println(ans[i]);
    }

  }
}

/*
 * >> java Sample3
 * a
 * a
 * a
 * a
 * a
 * a
 * a
 * a
 * a
 * a
 */