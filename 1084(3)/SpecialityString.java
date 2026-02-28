import java.io.*;
import java.util.Stack;

public class SpecialityString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if (n == 1) {
                out.append("NO\n");
                continue;
            }
            // for this to work it should be even number of char
            // also it should be symmetric like mllm or siixxs to work

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.removeLast();
                } else {
                    stack.push(ch);
                }
            }
            out.append((stack.isEmpty()) ? "YES\n" : "NO\n");
        }
        System.out.println(out.toString());
    }
}