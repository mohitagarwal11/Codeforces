import java.io.*;

public class BitPP {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String[] statement = new String[n];
    for (int i = 0; i < n; i++) {
      statement[i] = br.readLine();
    }

    int x = 0;
    for (int i = 0; i < n; i++) {
      if (statement[i].equals("X++")) {
        x++;
      }
      if (statement[i].equals("X--")) {
        x--;
      }
      if (statement[i].equals("++X")) {
        ++x;
      }
      if (statement[i].equals("--X")) {
        --x;
      }
    }
    System.out.println(x);
  }
}