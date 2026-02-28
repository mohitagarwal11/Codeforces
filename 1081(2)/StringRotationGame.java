import java.io.*;

public class StringRotationGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int blocks = 0;
            boolean hasEqual = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != s.charAt((i + 1) % n))
                    blocks++;
                else
                    hasEqual = true;
            }
            if (blocks == 0)
                System.out.println("1");
            else if (hasEqual)
                System.out.println(blocks + 1);
            else
                System.out.println(blocks);

        }
    }
}