import java.io.*;

public class BeautifulMatrix {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int row = 0;
    int col = 0;
    int c = 0;
    String[] str;
    int[] arr = new int[5];
    while (row < 5) {
      str = br.readLine().split(" ");
      for (col = 0; col < 5; col++) {
        arr[col] = Integer.parseInt(str[col]);
        if (arr[col] == 1) {
          c = col;
          break;
        }
      }
      if (arr[c] == 1)
        break;
      else
        row++;
    }
    int steps = 0;
    steps += Math.abs(2 - row);
    steps += Math.abs(2 - c);
    System.out.println(steps);
  }
}