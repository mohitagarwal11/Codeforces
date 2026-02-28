import java.io.*;

public class ParkourDesign {
  public static void main(String[] args) throws IOException {
    StringBuilder out = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      String[] str = br.readLine().split(" ");
      long x = Long.parseLong(str[0]);
      long y = Long.parseLong(str[1]);

      boolean isPossible = false;

      long sol = (x - 2L * y);

      // a = y+c
      // sol = 3(b+2c)
      // since b and c is always positive we get sol>=0
      // %3 frm formula
      // now c is reverse of as much y negative we have so if y is -5 then we need to
      // do 3rd jump 5 times so c 5 but not needed if y is +ve

      if (sol >= 0 && sol % 3 == 0 && sol / 3 >= 2L * Math.max(0L, -y)) {
        isPossible = true;
      }

      if (isPossible)
        out.append("yes\n");
      else
        out.append("no\n");
    }
    System.out.println(out.toString());
  }
}