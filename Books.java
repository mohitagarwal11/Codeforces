import java.io.*;

public class Books {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str1 = br.readLine().split(" ");
    int n = Integer.parseInt(str1[0]);
    int t = Integer.parseInt(str1[1]);

    String[] str = br.readLine().split(" ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    int sum = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      
    }
    System.out.println(count);
  }
}
