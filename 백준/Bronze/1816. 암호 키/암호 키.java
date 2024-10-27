import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean b = true;
            long num = Long.parseLong(br.readLine());

            for (int j = 2; j <= 1000000; j++) {
                if (num % j == 0) {
                    System.out.println("NO");
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println("YES");
            }
        }
    }
}
