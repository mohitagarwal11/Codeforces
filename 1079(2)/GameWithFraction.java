import java.util.*;

public class GameWithFraction {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long p = sc.nextLong();
            long q = sc.nextLong();

            if (q > p && 3L * p >= 2L * q) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}
