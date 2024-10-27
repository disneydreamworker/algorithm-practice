import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //3
        //5 9
        //1 4
        //3 7

        int n = Integer.parseInt(br.readLine());
        int[] time = new int[1001];
        int total= 0;
        int cnt = Integer.MAX_VALUE;
        int[][] arr = new int[n][2];

        for(int i = 0 ; i < n ; i++){

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()); // 5, 1, 3
            arr[i][0] = start;

            int end = Integer.parseInt(st.nextToken()); // 9, 4, 7
            arr[i][1] = end;

            for (int j = start; j < end; j++) {
                if (time[j] == 0) {
                    total++;
                }
                time[j]++;
            }
        }

        for(int i=0; i<n; ++i) {
            int c = 0;
            for(int j=arr[i][0]; j<arr[i][1]; ++j) {
                if(time[j]<=1) {
                    ++c;
                }
            }
            cnt = Math.min(cnt, c);
        }

        System.out.println(total - cnt);
    }
}
