import java.io.*;

public class FriendlyNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      long x = Integer.parseInt(br.readLine());
      int count = 0;

      for (int s = 1; s <= 90; s++) {
        long y = x + s;

        int sum = 0;
        while (y > 0) {
          sum += y % 10;
          y /= 10;
        }

        if (sum == s) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}