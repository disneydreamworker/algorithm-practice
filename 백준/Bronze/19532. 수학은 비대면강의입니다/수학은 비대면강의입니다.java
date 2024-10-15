import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        boolean f = false;

        for (int x = -999; x < 1000 ; x++) {
            for (int y = -999; y <1000 ; y++) {
                if ((nums[0] * x) + (nums[1] * y) == nums[2] && (nums[3] * x) + (nums[4] * y) == nums[5]) {
                    System.out.println(x + " " + y);
                    f = true;
                    break;
                }
            }
            if (f) break;
        }

    }
}
