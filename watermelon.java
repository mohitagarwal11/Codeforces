import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();
        System.out.println((weight > 2 && weight % 2 == 0) ? "YES" : "NO");
        scan.close();
    }
}