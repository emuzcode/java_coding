// Dividing 5 character strings by separating them with a single-byte space

public class Sample2 {
  public static void main(String[] args) {
    String line = "one two three four five";
    String[] array = line.split(" ");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}

/*
 * >> java Sample2
 * one
 * two
 * three
 * four
 * five
 */