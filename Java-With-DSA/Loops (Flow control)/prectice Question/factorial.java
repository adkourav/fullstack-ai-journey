// Question 3 :Write a program to find the factorialof any number entered by the user.

import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int fact = 1 ;

        for(int i = 1 ; i <= n ; i++){
            fact = fact*i;
        sc.close();    
        }
        System.out.println("factorial is :-" + fact);
        // System.out.printf("factorial is :-" + fact);
    }
    
}
