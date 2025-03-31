import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();

        int left = 0;
        int right = word.length() -1;
        
        while (left < right ) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println(0);
                return;
            }
            
            left++;
            right--;
        }
        
       System.out.println(1);
    }
}