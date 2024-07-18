class Solution {
    public int[] solution(int brown, int yellow) {
        int p = brown + yellow;
        int[] answer = {};
        
        for (int i = 3; i <= p/2 ; i++) {
            for (int j = 3; j<=i; j++) {
                if ((i*j == p) && ((i-2) * (j-2) == yellow)) {
                  answer = new int[] {i, j};
                  return answer;
                }
            }
        }
        
        return answer;
    }
}