import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static HashMap<String, Integer> getHashMap(String line, HashMap<String, Integer> map) {
    StringTokenizer st = new StringTokenizer(line);
    map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
    return map;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 브실이가 수강한 과목 수
    int m = Integer.parseInt(st.nextToken()); // 브실대학에서 요구하는 과목 수
    int k = Integer.parseInt(st.nextToken()); // 브실대학에서 공개한 과목 수

    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String line = br.readLine();
      map = getHashMap(line, map);
    }

    int answer = 0;
    ArrayList<String> openSubjects = new ArrayList<>();
    
    for (int i = 0; i < k; i++) {
      String subject = br.readLine();
      openSubjects.add(subject);
      answer += map.get(subject);
    }
    
    // 공개된 과목들을 map에서 제거
    for (String subject : openSubjects) {
      map.remove(subject);
    }
    
    // 남은 과목들의 점수를 리스트에 저장
    ArrayList<Integer> remainingScores = new ArrayList<>(map.values());
    Collections.sort(remainingScores);
    
    int min = answer;
    int max = answer;
    
    // 최소 점수: 가장 작은 m-k개의 점수를 더함
    for (int i = 0; i < m - k; i++) {
      min += remainingScores.get(i);
    }
    
    // 최대 점수: 가장 큰 m-k개의 점수를 더함
    for (int i = 0; i < m - k; i++) {
      max += remainingScores.get(remainingScores.size() - 1 - i);
    }

    System.out.println(min + " " + max);
  }
}