import java.io.*;
import java.util.*;

public class MeetingFriends {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");

    // Arrays.sort(str);
    int[] arr = new int[3];
    for (int i = 0; i < 3; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(arr);
    int min = (arr[2] - arr[1]) + (arr[1] - arr[0]);
    System.out.println(min);
  }
}