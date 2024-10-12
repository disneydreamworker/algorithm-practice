
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[9];

        for (int i = 0; i < 9; i++) {
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        for (int a = 0; a < 9 ; a++) {
            //a : 0, 1, 2, 3, 4, 5, 6, 7, 8 번째 난쟁이를 제외
            for (int b = a + 1; b < 9; b++) {
                int sum = 0;
                //b : 1, 2, 3, 4, 5, 6, 7, 8 번째 난쟁이를 제외
                // a : 0일 때 : (0, 1) (0, 2) (0, 3) (0, 4) (0, 5) (0, 6) (0, 7) (0, 8) (0, 9) 제외한 7 숫자 +
                // a : 1일 때 : (1, 1) (1, 2) (1, 3) (1, 4) (1, 5) (1, 6) (1, 7) (1, 8) (1, 9) 제외한 7 숫자 +
                // a : 2일 때 : (2, 1) (2, 2) (2, 3) (2, 4) (2, 5) (2, 6) ...

                for (int j = 0; j < 9; j++) {
                    if (j != a && j != b) {
                        sum += list[j];
                    }
                }

                if (sum == 100) {
                    for (int j = 0; j < 9; j++) {
                        if (j != a && j != b) {
                            System.out.println(list[j]);
                        }
                    }
                    return;
                }
            }
        }

    }
}
