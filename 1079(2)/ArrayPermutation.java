import java.io.*;
import java.util.*;

public class ArrayPermutation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      HashSet<Integer> seen = new HashSet<>();
      int[] p = new int[n];
      for (int i = 0; i < n; i++) {
        p[i] = Integer.parseInt(str[i]);
        seen.add(p[i]);
      }

      String[] str1 = br.readLine().split(" ");
      int[] a = new int[n];
      boolean possible = true;
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(str1[i]);
        if (!seen.contains(a[i])) {
          possible = false;
        }
      }
      if (!possible) {
        System.out.println("No");
        continue;
      }

      // now i hv to check for continuous or not like middle blocks not allowed
      HashSet<Integer> found = new HashSet<>();
      int prev = a[0];
      for (int i = 1; i < n; i++) {
        if (a[i] != prev) {
          // got a new value we add
          found.add(prev);

          if (found.contains(a[i])) {
            possible = false;
            break;
          }

          prev = a[i];
        }
      }
      if (!possible) {
        System.out.println("No");
        continue;
      }

      // now for realtive position ek ke bad ek aana hi pdega blocks ke liye
      int[] position = new int[n + 1];
      for (int i = 0; i < n; i++) {
        position[p[i]] = i;
      }

      int lastPos = position[a[0]];

      for (int i = 1; i < n; i++) {
        if (a[i] != a[i - 1]) {
          int currPos = position[a[i]];
          if (currPos < lastPos) {
            possible = false;
            break;
          }
          lastPos = currPos;
        }
      }

      if (possible)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}