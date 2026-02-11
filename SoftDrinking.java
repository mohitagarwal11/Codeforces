import java.io.*;

public class SoftDrinking {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int n = Integer.parseInt(line[0]);
    int k = Integer.parseInt(line[1]);
    int l = Integer.parseInt(line[2]);
    int c = Integer.parseInt(line[3]);
    int d = Integer.parseInt(line[4]);
    int p = Integer.parseInt(line[5]);
    int nl = Integer.parseInt(line[6]);
    int np = Integer.parseInt(line[7]);

    int totalDrink = k * l;
    int min = (c > 0) ? Math.min(totalDrink / nl, p / np) : 0;
    min = Math.min(c * d, min);
    System.out.println(min / n);
  }
}