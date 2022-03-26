//Input an integer of 10 lines

public class Sample4 {
  public static void main(String[] args) {
    double random = Math.random();
    double[] array = new double[10];
    for (int i = 0; i < array.length; i++) {
      random = (int) (Math.random() * 10);
      array[i] = random;
      System.out.println(array[i]);
    }
  }
}

/*
 * >> java Sample4
 * 1.0
 * 2.0
 * 0.0
 * 5.0
 * 4.0
 * 2.0
 * 4.0
 * 5.0
 * 8.0
 * 4.0
 */
