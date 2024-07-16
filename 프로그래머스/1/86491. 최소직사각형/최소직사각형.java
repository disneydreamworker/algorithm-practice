class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int[] size : sizes){
            if (size[0] > size[1]) {
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            
            max1 = Math.max (max1, size[0]);
            max2 = Math.max (max2, size[1]);
        }
        
        answer = max1 * max2;
        return answer;
    }
}