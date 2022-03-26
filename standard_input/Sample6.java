// Input of N integers given in the first line

import java.util.*;

class Sample6 {
  public static void main(String[] args) {
    Random random = new Random();
    int N = random.nextInt(10);
    int[] ans = new int[N];
    for (int i = 0; i < N; i++) {
      int numbers = random.nextInt(100);
      ans[i] = numbers;
    }
    for (int i : ans) {
      System.out.println(i);
    }
  }
}

/*
 * >> java Sample6
 * 54
 * 1
 * 92
 * 80
 * 54
 * 64
 */