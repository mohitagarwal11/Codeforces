import java.util.Scanner;

public class ReversePermutation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int test = scan.nextInt();
    while (test-- > 0) {
      int n = scan.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
      }

      for (int i = 0; i < n; i++) {
        if (arr[i] != n - i) {
          int r = i;
          while (arr[r] != n - i) {
            r++;
          }

          int l = i;
          while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
          }
          break;
        }
      }

      for (int num : arr) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    scan.close();
  }
}
