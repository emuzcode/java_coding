// Input 10 integers separated by half-width spaces

class Sample5 {
  public static void main(String[] args) {
    double[] arrayInt = new double[10];
    for (int i = 0; i < arrayInt.length; i++) {
      arrayInt[i] = (int) (Math.random() * 10);
      System.out.println(arrayInt[i]);
    }
  }
}

/*
 * >> java Sample5
 * 5.0
 * 1.0
 * 6.0
 * 5.0
 * 7.0
 * 0.0
 * 5.0
 * 4.0
 * 4.0
 * 3.0
 */
