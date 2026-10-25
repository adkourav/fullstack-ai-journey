import java.util.*;

public class fabinacoSeries {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n :- ");
        int n = sc.nextInt();

        int first = 0 ; 
        int second = 1 ; 

        // for print first and second number 
        // for first index write direct print 
        System.out.print(first + " ");

        // for second index 
        if(n > 1){
            System.out.print(second + " ");
        }

        for(int i = 2 ; i < n ; i++){
            int next = first + second ;
            
            // update 
            first =  second ; 
            second = next ; 
            // return next ; 
            System.out.print(next + " ");
        }
        sc.close();
    }
}
