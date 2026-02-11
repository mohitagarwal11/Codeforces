import java.io.*;

public class DivisiblePermutation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int[] perm = new int[n];

      if (n == 1) {
        System.out.println("1");
        continue;
      }

      int small = 1;
      int big = n;

      for (int i = n - 1; i >= 0; i -= 2) {
        if (i == 0) {
          perm[0] = small;
          break;
        }
        perm[i] = small++;
        perm[i - 1] = big--;
      }
      for (int per : perm) {
        System.out.print(per + " ");
      }
      System.out.println();
    }
  }
}