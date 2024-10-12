
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = input[0]; //양 한마리가 먹는 그램
        int b = input[1]; //염소 한마리가 먹는 그램
        int n = input[2]; //총 마리수
        int w = input[3]; //총 그램수

        int cnt = 0;
        int sheeps = 0;
        int goats = 0;

        //양 1 일 때부터 카운트
        for (int s = 1; s < n; s++) { //양 1,2,3,4
            int g = n - s; //염소의 수

            if ((a * s) + (b * g) == w) {
                sheeps = s;
                goats = g;
                cnt++;
            }
        }

        if (cnt == 1) { // 가능한 경우가 하나일 때만 출력
            System.out.println(sheeps + " " + goats);
        } else { // 가능한 경우가 없거나 여러 개일 경우
            System.out.println(-1);
        }

        scanner.close();
    }
}
