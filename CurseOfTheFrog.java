import java.io.*;

public class CurseOfTheFrog {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    while (t-- > 0) {
      String[] str = br.readLine().split(" ");
      int n = Integer.parseInt(str[0]);
      long x = Long.parseLong(str[1]);

      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];
      for (int i = 0; i < n; i++) {
        String[] str1 = br.readLine().split(" ");
        a[i] = Integer.parseInt(str1[0]);
        b[i] = Integer.parseInt(str1[1]);
        c[i] = Integer.parseInt(str1[2]);
      }
      // got the inputs

      // have to put everything in a list maybe?
      // list = [[a0,b0,c0],[a1,b1,c1]]
      // accessing would be tough though

      // the solution wants us to find out aibi-ci
      // cuz thats the net each type goes forward
      // so lets find out the max we can jump with using one rollback
      // and also we can find the min we can go after using all jumps
      // and still no rollbacks because bi-1 is no rollback for each ai

      long maxNet = Long.MIN_VALUE;
      long start = 0;
      for (int i = 0; i < n; i++) {
        long net = (long) a[i] * b[i] - c[i];
        maxNet = Math.max(net, maxNet);
        start += (long) a[i] * (b[i] - 1);
      }
      // start tells us the min we can go forward without rollback once

      x -= start;
      if (x <= 0) { // agar hum alrdy aa gaye x ke smne wihtout rolling
        System.out.println("0");
        continue;
      }
      if (maxNet <= 0) { // agar forward nhi ja skte toh print -1
        System.out.println("-1");
        continue;
      }
      // idk what is happening here tho
      // we hv all the ramaining cases that need more than one rollback
      // and probabaly more than one type of rollback
      // but we dont care of the more than one type cuz the start alrdy checked that
      // and we only care abt jumping max we can now to reach end
      // each type has been used there min number of time alrdy
      // but here we only use the largest value and find min rollback frm there
      // idek why we do -1 ???????????????????
      // (startX + maxNet) is the index we get to after one rollback with maxNet
      // why -1?
      // divide by maxNet to get rollbacks value ok
      // also should we do ceiling here for when not divisible??

      // OKAY so this is a ceiling type formula to get ceiling value
      // it return the cieling
      // Eg: x= 9 and m=3 then 9+3-1 = 11/3 return 3;
      // but: x = 10 and m=3 then 10+3-1 = 12/3 returns 4;

      System.out.println((x + maxNet - 1) / maxNet);
    }
  }
}