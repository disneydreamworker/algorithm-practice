import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      if (N == 0 && M == 0) {
        break;
      }

      int[] n = new int[N];

      for (int i = 0; i < N; i++) {
        n[i] = Integer.parseInt(br.readLine());
      }

      int result = 0;

      for (int i = 0; i < M; i++) {
        int target = Integer.parseInt(br.readLine());

        if (Arrays.binarySearch(n, target) >= 0) {
          result++;
        }
      }

      sb.append(result).append("\n");
    }
    System.out.println(sb);
  }
}
