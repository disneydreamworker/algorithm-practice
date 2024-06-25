import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //<이름><boolean 완주 0:1>
        HashMap<String, Integer> participants = new HashMap<String,Integer>();
        for(String n : participant) {
           participants.put(n, participants.getOrDefault(n, 0) + 1);
        }
        for (String c : completion) {
            int check = participants.get(c);
            if (check > 1) {
                participants.put(c, check-1);
            } else {
                participants.remove(c);
            }
        }
        String result = participants.keySet().toString(); //[john]
        return result.substring(1, result.length() - 1);
    }
}