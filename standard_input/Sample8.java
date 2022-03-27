// Input of N real numbers given in the first line

import java.util.*;

class Sample8 {
  public static void main(String[] args) {
    Random r = new Random();
    int N = r.nextInt(10);
    double[] d = new double[N];
    double db;
    for (int i = 0; i < N; i++) {
      db = r.nextDouble(10);
      d[i] = db;
    }
    for (double num : d) {
      System.out.println(num);
    }
  }
}

/*
 * >> java Sample8
 * 8.953499397365055
 * 7.538436450017657
 * 0.5758708459400885
 * 4.881602321226467
 * 3.7657935743218984
 */