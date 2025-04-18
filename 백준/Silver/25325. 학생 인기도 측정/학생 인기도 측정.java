import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine()); //학생 이름
    HashMap<String, Integer> map = new HashMap<>();

    while (st.hasMoreTokens()) {
      map.put(st.nextToken(), 0);
    }

    while (n-- > 0) {
      st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        String name = st.nextToken();
        map.put(name, map.getOrDefault(name, 0) + 1);
      }
    }

    List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

    Collections.sort(list, new Comparator<Entry<String, Integer>>() {
      @Override
      public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        if (o1.getValue().equals(o2.getValue())) {
          return o1.getKey().compareTo(o2.getKey());
        }
        return o2.getValue() - o1.getValue();
      }
    });

    for (Map.Entry<String, Integer> entry : list) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
