import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();

    int sum = 0;
    int cnt = -1;
    int min = 1000000;

    for (int i = 0; i < N; i++) { //버스정류장의 개수만큼 반복
      int S = scanner.nextInt();
      int I = scanner.nextInt();
      int C = scanner.nextInt();

      sum = S; //버스의 도착 시간

      for (int j = 0; j < C; j++) { //버스의 대수만큼 반복
        if (T <= sum) { //영식이가 도착한 시간이 버스의 도착시간보다 작거나 같으면
          cnt = sum - T; //버스의 도착 시간 - 영식이가 도착한 시간 = 영식이가 기다린 시간
          break;
        }
        sum += I; //대기 시간 이후 다음 버스가 도착하는 시간
      }

      if (cnt <= min && cnt != -1) { //영식이가 기다린 시간이 최소 시간보다 작으면
        min = cnt; //최소 시간 재설정
      }
    }

    if (cnt == -1) { //영식이가 어떤 버스도 타지 못하면 -1 출력
      System.out.println(cnt);
    } else { //최소 시간 출력
      System.out.println(min);
    }
  }
}
