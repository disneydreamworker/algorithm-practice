import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static void main (String[] args) throws IOException {
    HashMap<Integer, Integer> X = new HashMap<>();
    HashMap<Integer, Integer> Y = new HashMap<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int lines = Integer.parseInt(br.readLine());

    for (int i = 0; i < lines; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      X.put(x, X.getOrDefault(x, 0) + 1);
      Y.put(y, Y.getOrDefault(y, 0) + 1);
    }

    int result = 0;

    for (int x : X.values()) {
      if (x > 1) {
        result++;
      }
    }

    for (int y : Y.values()) {
      if (y > 1) {
        result++;
      }
    }

    System.out.println(result);
  
  }
}
