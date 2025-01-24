// 1. Write a program to check if a number is prime.
import java.util.Scanner;
public class primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:-");
        int i = sc.nextInt();
        int count=0;
        for(int a=2;a<i;a++){
            if(i%a==0)
            count++;
        }
        if(count<2){
            System.out.println(i+" is a prime number");
        }else{
            System.out.println(i+" is not a prime number");
        }
        sc.close();;
    }
}
/* output
 PS F:\Project\Java\question> javac primenumber.java
 PS F:\Project\Java\question> java primenumber      
 Enter a number:-12
 12 is not a prime number
 PS F:\Project\Java\question> java primenumber
 Enter a number:-17
 17 is a prime number
 */