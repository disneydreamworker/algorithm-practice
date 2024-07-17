import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        //1번 수포자는 5개씩 반복
    int[] p1 = {1,2,3,4,5,1,2,3,4,5};
    //5 1 2 3 4 0 1 2 3 4 0
    //2번 수포자는 8개씩 반복
    int[] p2 = {2,1,2,3,2,4,2,5,2};
    //3번 수포자는 10개씩 반복
    int[] p3 = {3,3,1,1,2,2,4,4,5,5,3};

    int score1 = (int)IntStream.range(0, answers.length).filter(i -> answers[i] == p1[i % 5]).count();
    int score2 = (int)IntStream.range(0, answers.length).filter(i -> answers[i] == p2[i % 8]).count();
    int score3 = (int)IntStream.range(0, answers.length).filter(i -> answers[i] == p3[i % 10]).count();

    Map<Integer, Integer> map1 = new HashMap<>();
    map1.put(1, score1);
    map1.put(2, score2);
    map1.put(3, score3);
    int max = map1.values().stream().max(Integer::compareTo).get();
    
    return map1.entrySet().stream().filter(entry -> entry.getValue() == max).mapToInt(Map.Entry :: getKey).toArray();
        // int[] answer = {};
        // return answer;
    }
}