import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start  = commands[i][0];
            int end    = commands[i][1];
            int select = commands[i][2];

            answer[i] = result(start, end, select, array);
        }

        return answer;
    }

    public int result(int start, int end, int select, int[] array){
        int selectNum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int j = start - 1; j < end; j++){
            list.add(array[j]);
        }

        Collections.sort(list);

        return selectNum = (int) list.get(select-1);
    }
}