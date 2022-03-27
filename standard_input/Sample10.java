// Input an integer column with a different number of elements for each row

import java.util.*;

class Sample10 {
  public static void main(String[] args) {
    Random r = new Random();
    int N = r.nextInt(5);
    for (int i = 0; i < N; i++) {
      int M = r.nextInt(5);
      for (int j = 0; j < M; j++) {
        int a = r.nextInt(100);
        System.out.print(a);
        if (j < M - 1) {
          System.out.print(" ");
        } else {
          System.out.println();
        }
      }
    }
  }
}

/*
 * >> java Sample10
 * 77 84 31
 * 77 45 34
 * 66 42 22
 */