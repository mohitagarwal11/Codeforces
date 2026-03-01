import java.io.*;

public class AnotherProblemBeautifulPairs {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Long.parseLong(str[i]);
      }

      long count = 0;
      for (int i = 0; i < n; i++) {

        long ai = arr[i];

        if (ai >= n)
          continue;
        if (i + ai >= n)
          continue;

        long limit = (n - 1 - i) / ai;

        for (long aj = 1; aj <= limit; aj++) {

          int j = (int) (i + ai * aj);

          if (arr[j] == aj) {
            count++;
          }
        }
      }

      sb.append(count).append("\n");
    }
    System.out.print(sb);
  }
}