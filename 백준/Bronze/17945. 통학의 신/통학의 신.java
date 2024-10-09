import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = -3000 ; i < 3001 ; i++) {
            if (((i * i) + (2 * a * i) + b) == 0) {
                System.out.println(i);
            }
        }

    }
}