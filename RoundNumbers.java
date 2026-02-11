import java.io.*;
import java.util.*;

public class RoundNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      int temp = n;
      int place = 1;
      List<Integer> parts = new ArrayList<>();

      while (temp > 0) {
        int digit = temp % 10;
        if (digit != 0) {
          parts.add(digit * place);
        }
        temp /= 10;
        place *= 10;
      }

      System.out.println(parts.size());
      for (int i = 0; i < parts.size(); i++) {
        if (i > 0) {
          System.out.print(" ");
        }
        System.out.print(parts.get(i));
      }
      System.out.println();
    }
  }
}
