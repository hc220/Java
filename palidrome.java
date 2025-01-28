import java.util.*;

public class palidrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
}
/**
 * 
 * output
 * Enter a string
   faf
   true
 */