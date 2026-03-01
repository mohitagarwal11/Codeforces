import java.util.*;

public class WordCapitalization {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    scan.close();
    // System.out.println(word);
    StringBuilder sb = new StringBuilder(word);
    sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
    System.out.println(sb);
  }
}