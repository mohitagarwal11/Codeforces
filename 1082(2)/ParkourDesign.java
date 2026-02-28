import java.io.*;

public class ParkourDesign {
  public static void main(String[] args) throws IOException {
    StringBuilder out = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      String[] str = br.readLine().split(" ");
      int x = Integer.parseInt(str[0]);
      int y = Integer.parseInt(str[1]);

      if ((x + y) % 3 == 0 && y >= (-x) / 4 && y <= x / 2) {
        out.append("yes\n");
      } else {
        out.append("no\n");
      }
    }
    System.out.println(out.toString());
  }
}