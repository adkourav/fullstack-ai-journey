

public class CheckPalindrome {

    public static void main (String args[]){

        String str = "123";
        String reverse = "";

        // loop 
        for(int i = str.length()-1; i>= 0 ; i-- ){

            reverse = reverse + str.charAt(i);
        }

        // check palindrome 

        if(str.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome ");
        }
    }
    
}
