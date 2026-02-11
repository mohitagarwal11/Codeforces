
// done in around 20mins
import java.util.Scanner;

public class DBMBArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int test = scan.nextInt();
    while (test-- > 0) {
      int n = scan.nextInt();
      int s = scan.nextInt();
      int x = scan.nextInt();
      int[] arr = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
        sum += arr[i];
      }
      if (sum == s) {
        System.out.println("YES");
        continue;
      } else if (sum > s) {
        System.out.println("NO");
        continue;
      } else {// sum < s
        int diff = s - sum;
        int isPossible = diff % x;
        if (isPossible == 0) {
          System.out.println("YES");
          continue;
        } else {
          System.out.println("NO");
          continue;
        }
      }
    }
    scan.close();
  }
}
