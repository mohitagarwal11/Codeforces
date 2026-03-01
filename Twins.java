import java.io.*;
import java.util.*;

public class Twins {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");
    int[] arr = new int[n];
    int total = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
      total += arr[i];
    }
    Arrays.sort(arr);
    int req = total / 2;

    int count = 0;
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (sum > req) {
        break;
      }
      sum += arr[i];
      count++;
    }
    System.out.println(count);
  }
}