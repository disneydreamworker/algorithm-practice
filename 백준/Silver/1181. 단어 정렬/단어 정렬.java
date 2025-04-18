import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Set<String> result = new TreeSet<>();

    while (n-- > 0) {
      result.add(br.readLine());
    }

    ArrayList<String> arrayList = new ArrayList<>(result);
    Collections.sort(arrayList, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) return o1.compareTo(o2);
        return o1.length() - o2.length();
      }
    });

    StringBuilder sb = new StringBuilder();
    for (String s : arrayList) {
      sb.append(s).append("\n");
    }

    System.out.print(sb);
  }
}
