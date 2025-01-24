//Find the factorial of a number.
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + fac(num)); 
        scanner.close();
    }

    public static int fac(int i) {
        if (i == 0)
            return 1;
        else
            return i * fac(i - 1);
    }
}
/*
 * PS F:\Project\Java\question> java factorial.java
   Enter a number to find its factorial: 5
   Factorial of 5 is 120
 */
