import java.io.*;

public class FlippingBinaryString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder out = new StringBuilder();
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String str = br.readLine();

      int oneCount = 0;
      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '1') {
          oneCount++;
        }
      }
      // both odd means immposible
      // if no one then 0
      // if n odd but one even then that many x
      // and rest one idx
      // agar onecount odd toh zero jitna h utna x hoga
      // and idx zero ka hi hoga
      // forgot abt 1000 types
      if ((n % 2 == 1) && (oneCount % 2 == 1)) {
        out.append("-1\n");
      } else if (oneCount == 0) {
        out.append("0\n");
      } else if ((oneCount % 2) == 0) {
        out.append(oneCount).append('\n');
        for (int i = 0; i < n; i++) {
          if (str.charAt(i) == '1')
            out.append(i + 1).append(' ');
        }
        out.append('\n');
      } else {
        int zeros = n - oneCount;
        out.append(zeros).append('\n');
        for (int i = 0; i < n; i++) {
          if (str.charAt(i) == '0')
            out.append(i + 1).append(' ');
        }
        out.append('\n');
      }
    }
    System.out.print(out.toString());
  }
}