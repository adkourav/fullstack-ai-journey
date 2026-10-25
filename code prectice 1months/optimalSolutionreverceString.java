import java.util.*;

public class optimalSolutionreverceString {
    // main function 
    public static void main (String args[]){
        // user input 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String :- ");
        String str = sc.nextLine();

        // convert String to array 

        char[] arr = str.toCharArray();

        int left = 0 ; 
        int right = arr.length-1;

        // while loop 
        
        while(right > left ){
            // swap 
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ; 

            // incremment 
            left++ ; 

            // decrement 

            right--;
        }

        System.out.println("reverse String :- "+new String (arr));
        sc.close();

    }
}
