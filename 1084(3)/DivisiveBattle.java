import java.io.*;

public class DivisiveBattle {
// not working
  static int largestDivisor(int x) {
    for (int d = 2; d * d <= x; d++) {
      if (x % d == 0) {
        return Math.max(d, x / d);
      }
    }
    return 1;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder out = new StringBuilder();
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(str[i]);
      }

      boolean alice = false;

      int front = arr[n - 1];

      for (int i = n - 2; i >= 0; i--) {
        while (arr[i] > front) {
          int sdiv = largestDivisor(arr[i]);
          if (sdiv == 1) {
            alice = true;
            break;
          }
          arr[i] = sdiv;
        }
        if (alice)
          break;
        front = arr[i];
      }
      out.append((alice) ? "Alice\n" : "Bob\n");
    }
    System.out.println(out.toString());
  }
}