import java.io.*;

public class EatingGame {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] arr = new int[n];
      int[] freq = new int[11];
      freq[0] = 0;
      int max = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(str[i]);
        freq[arr[i]]++;
        max = Math.max(max, arr[i]);
      }
      System.out.println(freq[max]);
    }
  }
}