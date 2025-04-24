import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(sc.nextLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }

    Collections.sort(list);

    for (int i = 0; i < M; i++) {
      int left = 0;
      int right = N - 1;
      int target = sc.nextInt();
      int answer = -1;

      while (left <= right) {
        int mid = (left + right) / 2;

        if (list.get(mid) == target) {
          answer = mid;
          right = mid - 1;
        } else if (list.get(mid) > target) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }

      System.out.println(answer);
    }

  }
}
