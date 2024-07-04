import java.util.*;
class Solution {

  public String solution(int[] numbers) {
    Integer[] a = new Integer[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      a[i] = numbers[i];
    }

    Arrays.sort(a, new Comparator<Integer>() {
      public int compare(Integer one, Integer two) {
        String val1 = String.valueOf(one) + two;
        String val2 = String.valueOf(two) + one;
        return val2.compareTo(val1);
      }
    });
      
   StringBuilder sb = new StringBuilder();
    int cnt=0;
    for (int n : a){
      sb.append(n);
      if (n == 0) {
        cnt++;
      }
    }
    if(cnt == a.length) {
      sb = new StringBuilder("0");
    }
    
    return sb.toString();
  }
}