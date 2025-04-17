import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static HashMap<String,Integer> getHashMap(String line, HashMap<String, Integer> map) {
    StringTokenizer st = new StringTokenizer(line);
    map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
    return map;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); //브실이가 수강한 과목 수
    int m = Integer.parseInt(st.nextToken()); //브실대학에서 요구하는 과목 수
    int k = Integer.parseInt(st.nextToken()); //브실대학에서 공개한 과목 수

    HashMap<String, Integer> map = new HashMap<>();
    while (n-- > 0) {
      String line = br.readLine();
      map = getHashMap(line, map);
    }

    int answer = 0;

    for (int i = 0; i < k; i++) {
      String line = br.readLine();
      answer += map.get(line);
      map.remove(line);
    }
    
    /*
    while (k-- > 0) {
      String line = br.readLine();
      answer += map.get(line);
      map.remove(line);
    }*/

    ArrayList<Integer> list = new ArrayList<>(map.values());
    Collections.sort(list);

    int min = answer;
    int max = answer;

    for (int i = 0; i < m - k; i++) {
      min += list.get(i);
    }

    for (int i = list.size() - 1; i >= list.size() - (m - k); i--) {
      max += list.get(i);
    }

    System.out.println(min + " " + max);

  }
}