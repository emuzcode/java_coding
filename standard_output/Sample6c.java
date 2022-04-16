// Output of a two-dimensional array with indefinite length and values ​​for all rows

public class Sample6c {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String[] first = sc.nextLine().split(" ");
    int N = 10; // Integer.parseInt(first[0]);
    int M = 4; // Integer.parseInt(first[1]);
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = i + 1; // sc.nextInt();
    }
    int[] B = { 2, 6, 1, 1 };
    int nextIndex = 0;
    for (int b : B) {
      for (int i = 0; i < b; i++) {
        System.out.print(A[nextIndex]);
        if (i < b - 1) {
          System.out.print(" ");
        } else {
          System.out.println();
        }
        nextIndex += 1;
      }
    }
    // sc.close();
  }
}

/*
 * >> java Sample6c
 * 1 2
 * 3 4 5 6 7 8
 * 9
 * 10
 */