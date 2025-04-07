import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int line = Integer.parseInt(br.readLine());
    Stack stack = new Stack();

    for (int i = 0; i < line; i++) {
      int n = Integer.parseInt(br.readLine());

      if (n ==0) {
        stack.pop();
      } else {
        stack.push(n);
      }
    }

    int result = stack.stream().mapToInt(r -> (int) r).sum();
    System.out.println(result);
  }
}