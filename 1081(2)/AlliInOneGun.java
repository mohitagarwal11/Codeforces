import java.io.*;

public class AlliInOneGun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] str1 = br.readLine().split(" ");
            int n = Integer.parseInt(str1[0]);
            int h = Integer.parseInt(str1[1]);
            int k = Integer.parseInt(str1[2]);
            String[] str2 = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str2[i]);
            }
            
        }
    }
}