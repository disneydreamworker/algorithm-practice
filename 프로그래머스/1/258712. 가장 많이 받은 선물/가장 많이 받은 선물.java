import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public static int solution(String[] friends, String[] gifts) {
    int answer = 0;
    int[][] table = new int[friends.length][friends.length]; //5 X 5 테이블 생성 (
    int[] giftsQuotient = new int[friends.length]; //각각의 선물 지수를 담을
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < friends.length; i++) {
      map.put(friends[i], i); //friends 배열의 인덱스 i의 이름이 Key, i(0,1,2,3,4)가 Value
      //joy, 0
      //brad, 1
      //alessandro, 2
      //conan, 3
      //david, 4
    }
    for (String gift : gifts) {
      String[] s = gift.split(" ");
      table[map.get(s[0])][map.get(s[1])] += 1; //map에 해당하는 인덱스의 값 1증가
      // "alessandro brad"
      //table[2][1] = 0 + 1;
    }
    for (int i = 0; i < table.length; i++) { //이중 for문으로 테이블 형식으로 만들기
      for (int j = 0; j < table[i].length; j++) {
        if (i >= j) { //4명일 때 서로 주고받은 선물의 개수를 확인하기 위한 최소 숫자는 6번이다.
          //중복으로 계산하지 않기 위해 i>=j이면 넘긴다
          continue;
        }
        if (table[map.get(friends[i])][map.get(friends[j])] == table[map.get(friends[j])][map.get(
            friends[i])]) { //table[1,0] [0,1]의 값이 같다면 서로 같은 선물의 수를 주고받음
          //선물 지수가 누가 더 높은지 확인
          int give1 = 0, give2 = 0, take1 = 0, take2 = 0;
          for (int k = 0; k < table.length; k++) {
            give1 += table[map.get(friends[i])][k];
            take1 += table[k][map.get(friends[i])];
            give2 += table[map.get(friends[j])][k];
            take2 += table[k][map.get(friends[j])];
          }
          if (give1 - take1 < give2 - take2) {
            // 2번 사람이 선물 지수가 더 크면
            giftsQuotient[map.get(friends[j])] += 1;
          } else if (give1 - take1 > give2 - take2) {
            giftsQuotient[map.get(friends[i])] += 1;
          }
          
        } else if (table[map.get(friends[i])][map.get(friends[j])] > table[map.get(friends[j])][map.get(
            friends[i])]) {
          // 선물 주고받은 기록 있으면
          giftsQuotient[map.get(friends[i])] += 1;
        } else {
          giftsQuotient[map.get(friends[j])] += 1;
        }
      }
    }
    answer = Arrays.stream(giftsQuotient).max().getAsInt();

    return answer;
}
}