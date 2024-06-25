import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        // 옷 종류별로 그룹화하기 위한 맵
        Map<String, Integer> map = new HashMap<>();
        
        // 옷 배열을 순회하면서 종류별로 개수를 세기
        for (String[] cloth : clothes) {
            String name = cloth[0];
            String kind = cloth[1];
            
            // 종류별로 개수를 증가시키기
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }
        // 모든 조합의 수 계산
        int answer = 1;
        for (int count : map.values()) {
            // 각 종류의 옷을 입거나 입지 않는 경우를 포함하여 곱하기
            answer *= (count + 1);
        }
        
        // 아무것도 입지 않는 경우를 제외하기 위해 1을 빼기
        return answer - 1;
    }
}