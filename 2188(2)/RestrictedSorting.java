import java.io.*;
import java.util.*;

public class RestrictedSorting {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(str[i]);
      }
      int[] sorted = new int[n];
      sorted = arr.clone();
      Arrays.sort(sorted);

      while (!arr.equals(sorted)) {

      }
    }
  }
}