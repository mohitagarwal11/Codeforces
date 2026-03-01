import java.io.*;

public class SieveOfEratos67henes {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] arr = new int[n];
      boolean hasSixtySeven = false;
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(str[i]);
        if (arr[i] == 67) {
          hasSixtySeven = true;
        }
      }
      if (hasSixtySeven)
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}