import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] answers = new int[1000];
        
        Arrays.sort(array);
        
        for (int a : array) {
            answers[a] += 1;
        }
        
        
        int index = 0;
        int maxCnt = 0;
        int cnt = 0;
        
        for (int k = 0; k< answers.length;k++) {
            if (answers[k] > maxCnt) {
                index = k;
                maxCnt = answers[k];
            }
        }
        
        
        for (int g = 0; g < answers.length; g++){
            if (g == index) {
                continue;
            } else if (answers[g] == answers[index]) {
                cnt++;
            }
        }
        
        if (cnt > 0) {
            return -1;
        } else {
            return index;
        }
    }
}