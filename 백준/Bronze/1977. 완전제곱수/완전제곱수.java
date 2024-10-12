
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();
        int answer = 0;

        for (int i = a; i < b + 1 ; i++) {
            double check = Math.sqrt(i);

            if (check == (int)check) {
                answer += i;
                array.add(i);
            }
        }
        if (answer > 0) {
            System.out.println(answer);
            System.out.println(array.get(0));
        } else {
            System.out.println(-1);
        }
    }
}
