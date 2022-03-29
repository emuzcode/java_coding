// Output within 10 lines

import java.util.*;

public class Sample4 {
  public static void main(String[] args) {
    Random r = new Random();
    int N = r.nextInt(10);
    for (int i = 1; i <= N; i++) {
      System.out.println(i);
    }
  }
}

/*
 * >> java Sample4
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 */