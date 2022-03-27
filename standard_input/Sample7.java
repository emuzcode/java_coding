
// Input of N strings given in the first line

import java.nio.charset.*;
import java.util.*;

class AlphaNumericStringGenerator {
  static String getRandomString(int i) {

    byte[] bytearray;
    String mystring;
    StringBuffer thebuffer;

    bytearray = new byte[256];
    new Random().nextBytes(bytearray);

    mystring = new String(bytearray, Charset.forName("UTF-8"));

    // Create the StringBuffer
    thebuffer = new StringBuffer();

    for (int m = 0; m < mystring.length(); m++) {

      char n = mystring.charAt(m);

      if (((n >= 'A' && n <= 'Z')
          || (n >= '0' && n <= '9'))
          && (i > 0)) {

        thebuffer.append(n);
        i--;
      }
    }

    // resulting string
    return thebuffer.toString();
  }
}

class Sample7 {
  public static void main(String[] args) {
    Random r = new Random();
    int N = r.nextInt(10);

    String[] array = new String[N];

    int num = 8;
    for (int i = 0; i < N; i++) {
      String a_N = AlphaNumericStringGenerator.getRandomString(num);
      array[i] = a_N;
    }
    for (String a : array) {
      System.out.println(a);
    }
  }
}

/*
 * >> java Sample7
 * SV5HON54
 * 85M5M8WA
 * AIPASA38
 * GKVOWJ35
 * CDNH6VV2
 * BF09FXNB
 * 3E5Z7DOC
 */