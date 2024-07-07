// class Solution {
//     public int[] solution(int numer1, int denom1, int numer2, int denom2) {
//         if (numer1 == denom1) {
//             numer1 = denom2;
//             denom1 = denom2;
//         } else if (numer2 == denom2) {
//             numer2 = denom1;
//             denom2 = denom1;
//         }
//         int[] answer = {0,0};
//         int num1 = 0;
//         int num2 = 0;
//         //1
//         if (denom1 == denom2) {
//             answer[0] = numer1 + numer2;
//             answer[1] = denom1;
//         } 
//         //2
//         if (denom1 < denom2) {
//             if (denom2 % denom1 == 0) {
//                 num1 = denom2 / denom1;
//                 answer[1] = denom2;
//                 answer[0] = (num1 * numer1) + numer2;
//             } else { // 2, 3, 5, 4
//                 for (int i = 1 ; i < denom1 + 1; i++ ) { //i = 1~3
//                     for (int j = 1; j < denom2 + 1; j++) { //j= 1~5
//                         if (denom1 * j > denom2 * i) {
//                             continue;
//                         }
//                         if (denom1 * j == denom2 * i) {
//                             //i = 3, j = 5
//                             answer[1] = denom2 * i;
//                             answer[0] = (numer1 * j) + (numer2 * i);
//                             break;
//                         }
//                     }
//                 }
//             }
//         }
//         //3
//         if (denom1 > denom2) {
//             if (denom1 % denom2 == 0) {
//                 answer[1] = denom1;
//                 num1 = (denom1 / denom2);
//                 answer[0] = (num1 * numer2) + numer1;
//             } else { //3, 5, 2, 3
//                 for (int k = 1; k < denom2 + 1; k++) { //1~7
//                     for (int g = 1; g < denom1 + 1; g++) { //1~8
//                         if (g * denom2 > k * denom1) {
//                             continue;
//                         }
//                         if (denom2 * g == denom1 * k) {
//                             answer[1] = denom1 * k;
//                             answer[0] = (numer1 * k) + (numer2 * g);
//                             break;
//                         }
//                     }
//                 }
//             }
//         }
//         return answer;
//     }
// }


class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수를 더하는 로직
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        // 최대 공약수를 구해서 기약 분수로 만들기
        int gcd = gcd(numer, denom);
        numer /= gcd;
        denom /= gcd;
        
        return new int[] {numer, denom};
    }
    
    // 최대 공약수(GCD)를 구하는 함수
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}