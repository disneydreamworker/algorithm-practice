import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int add = 0;
        int result = 0;

//        while(sum <= 100) {
//            add = Integer.parseInt(br.readLine()); //sum : 98, add : 4
//
//            if (sum + add > 100) {
//                break;
//            } else if (sum + add == 100) {
//                result = 100;
//                break;
//            }
//            sum += add;
//        }
//
//        if (Math.abs(100 - sum) == Math.abs(100 - (sum + add))) {
//            result = sum + add;
//        }

        for (int i = 0 ; i < 10; i++) {
            add = Integer.parseInt(br.readLine());

            int temp = sum;
            sum += add;

            if (sum > 100) {
                if(Math.abs(100-temp) >= Math.abs(100-sum)) System.out.print(sum);
                else System.out.print(temp);
                System.exit(0);
            }

//            if (sum + add >= 100) {
//
//                if (Math.abs(100 -sum) >= Math.abs(100 - sum + add)) {
//                    sum += add;
//                }
//                break;
//            }
//            sum += add;
        }
        System.out.println(sum);
    }
}