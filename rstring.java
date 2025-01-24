//2. Write a program to reverse a string.
import java.util.*;
public class rstring {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:-");
         s = sc.nextLine();
        //String s1 = new StringBuilder(s).reverse().toString();
        int j = s.length();
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
/* output
 * PS F:\Project\Java\question> java rstring.java
   Enter String:-Harshil
   lihsraH
 */