import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    char c = st.nextToken().charAt(0);
    
    Set<String> parts = new HashSet<>();
    while (n --> 0) {
      parts.add(br.readLine());
    }
    int num = parts.size();
    int requiredPlayers = 0;
    switch (c) {
      case 'Y': requiredPlayers = 1; break; // 윷놀이는 임스 외 1명 필요
      case 'F': requiredPlayers = 2; break; // 같은 그림 찾기는 임스 외 2명 필요
      case 'O': requiredPlayers = 3; break; // 원카드는 임스 외 3명 필요
    }
    System.out.println(num / requiredPlayers);
  }
}