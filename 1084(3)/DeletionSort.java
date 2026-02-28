import java.io.*;

public class DeletionSort {
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

      boolean isSorted = true;
      for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
          out.append("1");
          isSorted = false;
          break;
        }
      }
      if (isSorted)
        out.append(n);

      out.append("\n");
    }
    System.out.println(out.toString());
  }
}