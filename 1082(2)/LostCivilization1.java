import java.io.*;
import java.util.*;

public class LostCivilization1 {
  public static void main(String[] args) throws IOException {
    StringBuilder out = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(str[i]);
      }

      HashMap<Integer, Integer> used = new HashMap<>();
      int blocks = 0;

      for (int i = 0; i < n; i++) {
      // if we have lower value which is not used in a block then we use that
      // and continue
      
        if (used.getOrDefault(arr[i] - 1, 0) > 0) {
          used.put(arr[i] - 1, used.get(arr[i] - 1) - 1);
        } else {
          blocks++;
        }
      }
      out.append(blocks).append("\n");
    }
    System.out.println(out.toString());
  }
}