// Output of N * N multiplication table

public class Sample6b {
  public static void main(String[] args) {
    int N = (int) Math.ceil(Math.random() * 10);
    int a = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        a = i * j;
        System.out.print(a);
        if (j == N) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}

/*
 * >> java Sample6b
 * 1 2 3 4 5
 * 2 4 6 8 10
 * 3 6 9 12 15
 * 4 8 12 16 20
 * 5 10 15 20 25
 */
