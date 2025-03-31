import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();

    String s = scan.nextLine();
    char[] chars = s.toCharArray();

    for (int i = 0; i < n - 1; i++) {
      String ss = scan.nextLine();

      for (int k = 0; k < chars.length; k++) {
        if (ss.charAt(k) != chars[k]) {
          chars[k] = '?';
        }
      }
    }

    System.out.println(String.valueOf(chars));

  }

}
