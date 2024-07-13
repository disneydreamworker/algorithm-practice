import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wordsCnt = sc.nextInt();
    sc.nextLine();

    TreeSet<String> treeSet = new TreeSet<>();

    while (sc.hasNext()) {
      treeSet.add(sc.nextLine());
    }

    List<String> list = new ArrayList<>(treeSet);

    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
          return o1.compareTo(o2);
        }
        return o1.length() - o2.length();
      }
    });

    for (String word : list) {
      System.out.println(word);
    }
  }
    
}