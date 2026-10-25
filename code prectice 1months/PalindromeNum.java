// check the number is palindrome or not 

import java.util.*;
public class PalindromeNum {
    public static void main (String args[]){
        // user input 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num :- ");
        int num = sc.nextInt();
        // int num  = 122;
        int original = num ;
        int reverse = 0 ;
        
        while (num > 0 ){
            int digit = num %10 ; 
            reverse = reverse * 10 + digit ; 
            num = num / 10 ; 
        }

        if (reverse == original ){
            System.out.println("palindrome ");

        }
        else {
            System.out.println("not palindrome ");
        }
        sc.close();
    }
    
}
