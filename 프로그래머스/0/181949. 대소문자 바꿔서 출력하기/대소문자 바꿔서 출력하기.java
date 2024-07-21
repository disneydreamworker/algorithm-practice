import java.util.Scanner;
import java.util.Arrays;

// 대문자 판별 : Character.isUpperCase('a') (char)
// 소문자 판별 : Character.isLowerCase('a') (char)

// 대문자 바꾸기 : str.toUpperCase() (String) 
// 소문자 바꾸기 : ("ABC").toLowerCase() (String)

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] cs = a.toCharArray();
          for (char c : cs) {
            c = (Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
            System.out.print(c);
          }
    }
}