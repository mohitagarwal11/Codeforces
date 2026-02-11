import java.util.Scanner;

public class ChewbaccaNum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String num = scan.nextLine();
    int n = num.length();
    int[] digits = new int[n];

    for (int i = 0; i < n; i++) {
      digits[i] = num.charAt(i) - '0';
    }
    for (int i = 0; i < n; i++) {
      if (digits[i] >= 5) {
        if (digits[i] == 9 && i == 0) {
          continue;
        }
        digits[i] = 9 - digits[i];

      }
    }
    for (int i = 0; i < n; i++)
      System.out.print(digits[i]);

    scan.close();
  }
}