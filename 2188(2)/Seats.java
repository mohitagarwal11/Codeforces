import java.io.*;

public class Seats {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    // UK THEY ADDED 1 BOTH ENDS TO MAKE EVERYTHING A MIDDLE SEGMENT
    // NOW SOLVE IT YOURSELF
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());
      String s = br.readLine().trim();

      s = '1' + s + '1';
      int total = 0;
      for (int right = 1, left = 0; right <= n; ++right) {
        // KYA RIGHT MEIN 0 H
        if (s.charAt(right) == '0') {
          // IF BOTH CASES HERE ARE TRUE THEN ONLY WE GOT A MIDDLE SEGMENT

          // FOR WHEN RIGHT KE PEECHE 1 H
          if (s.charAt(right - 1) == '1') {
            // REPLACE AGAR PEECHE 1 H KYUKI THAT IS OUR NEW SEGMENT START
            left = right;
          }
          // WHEN RIGHT KE SAMNE 1 H
          if (s.charAt(right + 1) == '1') {
            // IF YES THEN WE FIND THE PADDING
            // IF RIGHT ORIGINAL STRING KE END MEIN H TOH WE ADD 1 TO PADDING OR ELSE NO
            // SAME IF LEFT IS AT INITAL POSITION OF ORIGINAL STRING THEN WE ADD 1 OR ELSE
            // NO
            int c = ((right == n) ? 1 : 0) + ((left == 1) ? 1 : 0);
            // HERE WE FIND THE DIFF ADD 1 FOR FLOORING AND THE PADDING FOR MINIMIZING
            total += (right - left + 1 + c) / 3;
          }
        } else {
          // AGR RIGHT KHUD 1 H TOH WE GOT A 1 FRM THE INITAL STRING
          // CUZ RIGHT ALWAYS STAYS INSIDE THE ORIGINAL STRING LENGTH
          total++;
        }
      }
      System.out.println(total);
    }
  }
}