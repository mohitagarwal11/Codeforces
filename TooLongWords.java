import java.util.Scanner;

public class TooLongWords {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int test = 0;
    test = scan.nextInt();
    String[] result = new String[test];
    for (int i = 0; i < test; i++) {
      scan.nextLine();
      String word = scan.next();
      if (word.length() <= 10) {
        result[i] = word;
      } else {
        int end = word.length() - 1;
        result[i] = String.valueOf(word.charAt(0)) + (word.length() - 2) + word.charAt(end);
      }
    }
    for (

        int i = 0; i < test; i++) {
      System.out.println(result[i]);
    }
    scan.close();
  }
}
