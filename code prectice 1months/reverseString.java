import java.util.*;

public class reverseString{
    public static void main (String args[]){
        // String str = "Hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String str = sc.nextLine();
        String reverse = " ";

        // loop 
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            // add reverce variable 
            reverse = reverse + str.charAt(i);
        }

        //print 
        System.out.println("original str :- "+ str);
        System.out.println("reverse str :- "+ reverse);
        sc.close();
    }
}