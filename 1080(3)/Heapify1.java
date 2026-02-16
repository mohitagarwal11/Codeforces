import java.io.*;

public class Heapify1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");

            boolean isPossible = true;
            for (int i = 1; i <= n; i++) {
                int val = Integer.parseInt(str[i - 1]);
                int x = i;
                // we are finding the odd component of the curr idx
                while (x % 2 == 0)
                    x /= 2;
                int y = val;
                // and we are finding the odd component of the value
                while (y % 2 == 0)
                    y /= 2;
                if (x != y) {
                    isPossible = false;
                    break;
                }
                // 1 -- 1 2 4 8 16
                // 3 -- 3 6 12 24
                // 5 -- 5 10 20 40
                // 7 -- 7 14 28 56
                // SO IF THEY BOTH BELONG TO THE SAME TREE OF NUMBERS THEN IT IS POSSIBLE TO
                // TURN THEM INTO INCREASING ORDER
                // BY SWAPPING UNTIL WE GET THE DESIRED OUTPUT
            }
            System.out.println(isPossible ? "yes" : "no");
        }
    }
}