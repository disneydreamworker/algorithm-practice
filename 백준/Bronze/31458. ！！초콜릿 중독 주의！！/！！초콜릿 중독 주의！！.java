import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException  {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cases = Integer.parseInt(br.readLine());

    for (int c = 0; c < cases; c++) {
      String s = br.readLine();
      int index01 = -1;
      int left = 0;
      int answer = -1;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0' || s.charAt(i) == '1') {
          index01 = i;
          answer = s.charAt(i) - '0';
          break;
        } else {
          left++;
        }
      }

      if (s.indexOf("!", index01) != -1) { //숫자 기준 오른쪽에 !가 있으면 항상 true
        answer = 1;
      }

      answer = left % 2 == 1 ? 1 - answer : answer; //숫자 기준 왼쪽 !가 홀수이면 반전

      System.out.println(answer);
    }
    //
  }
}
