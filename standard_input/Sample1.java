//[Line input] Input 10 lines

import java.util.*;


public class Sample1 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] array = new char[10];

        for (int i=0;i<10;i++){
          char randomizedCharacter = (char)(random.nextInt(26) + 'a');
          array[i] = randomizedCharacter;
          System.out.println(array[i]);
        }
    }
}