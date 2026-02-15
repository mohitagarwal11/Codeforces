import java.io.*;

public class EvenOdds {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    long n = Long.parseLong(str[0]);
    long k = Long.parseLong(str[1]);

    long each = (n + 1) / 2;
    if (k <= each) {
      System.out.println(2 * k - 1);
    } else {
      System.out.println(2 * (k - each));
    }
  }
}