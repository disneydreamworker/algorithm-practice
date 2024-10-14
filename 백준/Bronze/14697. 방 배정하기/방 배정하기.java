import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = sc.nextInt();
        int temp = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    temp = (i * a) + (j * b) + (k * c);
                    if (temp == total) {
                        System.out.println(1);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(0);
    }
}