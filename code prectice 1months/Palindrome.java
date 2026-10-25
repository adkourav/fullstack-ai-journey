import java.util.*;
public class Palindrome {
    public static void main (String args[]){


        // USER INPUT 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :- ");
        String str = sc.nextLine();

        // string 
        // String str = "madams";
        String reverse ="";// Fixed: empty string, no space we cant provide a extra space in this code its faces the defficulty to compare the string  

        // reverse a string 

        for(int i = str.length()-1 ; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }

        // compare both string 
        if(str.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome ");
        }
        sc.close();
    }
}
