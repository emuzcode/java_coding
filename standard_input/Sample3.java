// Input 10 pieces separated by a single-byte space

import java.util.*;

public class Sample3 {
  public static void main(String[] args) {
    Random random = new Random();
    char[] array = new char[10];

    for (int i = 0; i < 10; i++) {
      char randomChar = (char) (random.nextInt(26) + 'a');
      array[i] = randomChar;
      System.out.println(array[i]);
    }
  }
}

/*
 * >> java Sample3
 * c
 * e
 * s
 * w
 * s
 * k
 * v
 * g
 * n
 * u
 */