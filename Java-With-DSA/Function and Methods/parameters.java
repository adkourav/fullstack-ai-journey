import java.util.*;

public class parameters {
    // public static void parameter(int a , int b ){// parameters or formal parameters 
    //     int sum = a + b;
    //     System.out.print("sum is :- " + sum);
    // }


    public static int  parameter(int a , int b ){
         int sum = a + b ;
         return sum ;
// we are return the sum directlly for that be change the void to int 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a :- ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :- ");
        int b = sc.nextInt();
        
        // parameter (a,b); // Arguments or Actual parameters
        int sum = parameter(a,b);
        System.out.print("Sum is :- " + sum); 
        sc.close();
    }
    
}
