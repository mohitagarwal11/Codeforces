import java.util.Scanner;

public class tableNumber {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- > 0) {
      int n = scan.nextInt();
      int rows = scan.nextInt();
      int col = scan.nextInt();
      int[] nums = new int[n];
      for (int i = 0; i < n; i++) {
        nums[i] = scan.nextInt();
      }
      int row_out = 0;
      int col_out = 0;
      int in = 0;
      for (int num : nums) {
        if (num <= rows && num > col) {
          col_out++;
        } else if (num > rows && num <= col) {
          row_out++;
        } else if (num <= rows && num <= col) {
          in++;
        }
      }
      int ans = Math.min((in + col_out), (in + row_out));
      ans = Math.min((in + col_out + row_out) / 2, ans);
      System.out.println(ans);
    }
    scan.close();
  }
}