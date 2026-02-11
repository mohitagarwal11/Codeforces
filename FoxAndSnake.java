import java.io.*;

public class FoxAndSnake {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] str = br.readLine().split(" ");
    int r = Integer.parseInt(str[0]);
    int c = Integer.parseInt(str[1]);

    int bend = c - 1;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (i % 2 == 0) {
          System.out.print("#");
        } else if (j == bend) {
          System.out.print("#");
        } else {
          System.out.print(".");
        }
      }
      if (i % 2 != 0) {
        bend = (bend == c - 1) ? 0 : c - 1;
      }
      System.out.println();
    }
  }
}