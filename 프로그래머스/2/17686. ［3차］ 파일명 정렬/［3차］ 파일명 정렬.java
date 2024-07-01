import java.util.Arrays;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = result(files);
        return answer;
    }
    

    public String[] result(String[] files) {
        Arrays.sort(files, (file1, file2) -> {
            int firstIndexA = findFirstNumberIndex(file1);
            String headA = file1.substring(0, firstIndexA).toLowerCase();
            int lastIndexA = findEndNumberIndex(firstIndexA, file1);
            int m = Integer.parseInt(file1.substring(firstIndexA, lastIndexA));

            int firstIndexB = findFirstNumberIndex(file2);
            String headB = file2.substring(0, firstIndexB).toLowerCase();
            int lastIndexB = findEndNumberIndex(firstIndexB, file2);
            int n = Integer.parseInt(file2.substring(firstIndexB, lastIndexB));

            int headComparison = headA.compareToIgnoreCase(headB);
            if (headComparison == 0) {
                return Integer.compare(m, n);
            } else {
                return headComparison;
            }
        });

        return files;
    }

    private int findFirstNumberIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return i;
            }
        }
        return str.length(); // 숫자가 없으면 문자열 끝을 반환
    }

    private int findEndNumberIndex(int startIndex, String str) {
        for (int i = startIndex; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return i;
            }
        }
        return str.length(); // 숫자가 끝까지 이어지면 문자열 끝을 반환
    }
}
