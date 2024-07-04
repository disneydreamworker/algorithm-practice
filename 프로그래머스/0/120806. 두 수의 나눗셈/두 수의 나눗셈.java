class Solution {
    public int solution(int num1, int num2) {
        double d = (double)num1/num2;
        d=d*1000;
        
        int answer = (int)d;
        return answer;
    }
}