import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int a : arr) {
            if (stack.isEmpty()) {
                stack.push(a);
            } else {
                if (stack.peek() != a) {
                    stack.push(a);
                } else {
                    continue;
                }
            }
        }
        
        answer = new int[stack.size()];
        
        for (int i = stack.size() -1 ; i >= 0 ; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}