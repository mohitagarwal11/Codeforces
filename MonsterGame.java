import java.io.*;
import java.util.*;

public class MonsterGame {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(str[i]);
      }
      String[] str1 = br.readLine().split(" ");
      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
        b[i] = Integer.parseInt(str1[i]);
      }
      Arrays.sort(a);

      long[] strikesForLevel = new long[n];
      strikesForLevel[0] = b[0];
      for (int i = 1; i < n; i++) {
        strikesForLevel[i] = b[i] + strikesForLevel[i - 1];
      }

      long maxScore = 0;

      for (int i = 0; i < n; i++) {
        if (i > 0 && a[i] == a[i - 1])
          continue;

        int x = a[i];
        int swordsLeft = n - i;

        int left = 0, right = n - 1;
        int maxLevels = -1;
        while (left <= right) {
          int mid = left + (right - left) / 2;
          if (strikesForLevel[mid] <= swordsLeft) {
            maxLevels = mid;
            left = mid + 1;
          } else {
            right = mid - 1;
          }
        }

        long score = (long) x * (maxLevels + 1);
        maxScore = Math.max(maxScore, score);
      }
      System.out.println(maxScore);
    }
  }
}
// import java.io.*;
// import java.util.*;

// public class MonsterGame {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int t = Integer.parseInt(br.readLine());

// while (t-- > 0) {
// int n = Integer.parseInt(br.readLine());
// String[] str = br.readLine().split(" ");
// int[] a = new int[n];
// for (int i = 0; i < n; i++) {
// a[i] = Integer.parseInt(str[i]);
// }
// String[] str1 = br.readLine().split(" ");
// int[] b = new int[n];
// for (int i = 0; i < n; i++) {
// b[i] = Integer.parseInt(str1[i]);
// }
// Arrays.sort(a);
// int[] swordsLeft = new int[a[n - 1] + 1];
// swordsLeft[0] = n;
// for (int i = 1; i < a[n - 1] + 1; i++) {
// int left = 0, right = n;
// while (left < right) {
// int mid = left + (right - left) / 2;
// if (a[mid] < i) {
// left = mid + 1;
// } else {
// right = mid;
// }
// }
// swordsLeft[i] = n - left;
// }
// int[] strikesForLevel = new int[n];
// strikesForLevel[0] = b[0];
// for (int i = 1; i < n; i++) {
// strikesForLevel[i] = b[i] + strikesForLevel[i - 1];
// }
// long maxScore = 0;
// for (int i = 0; i < swordsLeft.length; i++) {
// int strikes = swordsLeft[i];
// if (strikes == 0)
// break;

// int level = 0;
// while (level < n && strikes >= strikesForLevel[level]) {
// level++;
// }
// long score = i * level;
// maxScore = Math.max(maxScore, score);
// }
// System.out.println(maxScore);
// }
// }
// }