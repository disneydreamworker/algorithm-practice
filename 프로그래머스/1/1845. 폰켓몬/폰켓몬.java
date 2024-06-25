import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>() ;
        //선택할 수 있는 가장 큰 수는 나누기 2
        int max = nums.length/2;
        int answer;
        //set에 num 값 넣기
        for (int n : nums) { 
            set.add(n);
        }
        //max값보다 크다면 내가 받을 수 있는 최대값은 max이므로 max값 리턴
        if (max < set.size()) { 
            answer = max;
        } else {
            answer = set.size();
        }
        return answer;
    }
}