// Output large numbers every 3 digits, separated by commas

public class Sample5 {
  public static void main(String[] args) {
    String input = "12345678901234567890";
    String[] N = input.split("");
    int amari = input.length() % 3;
    for (int i = 0; i < input.length(); i++) {
      if (i != 0 && i % 3 == amari) {
        System.out.print(",");
      }
      System.out.print(N[i]);
    }
    System.out.println();
  }
}

/*
 * >> java Sample5
 * 12,345,678,901,234,567,890
 * 
 */