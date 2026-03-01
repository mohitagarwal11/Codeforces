import java.io.*;

public class AbsoluteCinema {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            long[] f = new long[n];
            for (int i = 0; i < n; i++) {
                f[i] = Long.parseLong(str[i]);
            }
            // i hv to find a1 to an-2 first
            // ai = (f(i+1)+f(i-1) -2f(i))/2;

            int a[] = new int[n];

            for (int i = 1; i < n - 1; i++) {
                long val = (f[i + 1] + f[i - 1] - 2L * f[i]) / 2L;
                a[i] = (int) val;
            }

            // now we find gx == fx - (n-2) terms
            // for g0 -- coefficient was, 0 1 2 3 .... n-1 times ai
            // for gn-1 -- coefficient was, n-1 n-2 n-3 .... 0 times ai
            // g0 = (n-1)an;
            // gn-1 = (n-1)a1;

            long g0 = f[0];
            long gn1 = f[n - 1];
            for (int i = 1; i < n - 1; i++) {
                g0 -= (long) i * a[i];
                gn1 -= (long) i * a[n - 1 - i];
            }

            a[0] = (int) (gn1 / (n - 1));
            a[n - 1] = (int) (g0 / (n - 1));

            for (int i = 0; i < n; i++) {
                if (i > 0)
                    sb.append(" ");
                sb.append(a[i]);
            }
            sb.append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}