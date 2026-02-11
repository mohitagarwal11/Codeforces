import java.util.Scanner;

public class ReplaceAndSum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int test = scan.nextInt();
    while (test-- > 0) {
      int n = scan.nextInt();
      int q = scan.nextInt();

      int[] arrA = new int[n];
      int[] arrB = new int[n];

      for (int i = 0; i < n; i++) {
        arrA[i] = scan.nextInt();
      }
      for (int i = 0; i < n; i++) {
        arrB[i] = scan.nextInt();
      }

      int[] altA = new int[n];
      for (int i = 0; i < n; i++) {
        altA[i] = Math.max(arrA[i], arrB[i]);
      }

      for (int i = n - 2; i >= 0; i--) {
        altA[i] = Math.max(altA[i], altA[i + 1]);
      }

      while (q-- > 0) {
        int left = scan.nextInt();
        int right = scan.nextInt();

        long maxSum = 0;
        for (int i = left - 1; i < right; i++) {
          maxSum += (long) altA[i];
        }

        System.out.print(maxSum + " ");
      }
      System.out.println();
    }
    scan.close();
  }
}
