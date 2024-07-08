import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) {
            if (i % 2 == 1) {
                array.add(i);
            }
        }
        
        int[] result = new int[array.size()];
        for(int k=0;k<result.length;k++){
            result[k] = array.get(k);
        }
        return result;
    }
}