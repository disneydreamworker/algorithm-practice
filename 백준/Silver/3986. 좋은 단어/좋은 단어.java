import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    String s;
    int cnt = 0;

    while ((s = br.readLine()) != null) {
      // 첫 문자와 두 번째 문자가 같을 경우
      // 스택에서 바로 제거
      // 첫 문자와 두 번째 문자가 다를 경우
      // a b a -> 교차로 나오면 안됨
      // 스택이 empty면 cnt++
      Stack<Character> stack = new Stack<>();

      for (char c : s.toCharArray()) {
        if (stack.isEmpty()) {
          stack.push(c);
        } else {
          if (stack.peek() == c) {
            stack.pop();
          } else {
            stack.push(c);
          }
        }
      }

      if (stack.isEmpty()) cnt++;
    }

    System.out.println(cnt);
  }
}
