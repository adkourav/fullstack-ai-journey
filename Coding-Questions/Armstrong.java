// Armstrong number is bacically :-  a number where the sum of each number digit is raised by the power of total number of digit is equal to the original number 

public class Armstrong {
    public static boolean isArmstrone (int num){
        int original = num ; 

        int sum = 0 ; 

        while (num > 0 ){

            int digit = num % 10 ; 

            sum = sum + digit * digit * digit ;

            num = num / 10 ; 

        }
        return sum == original ; 
    }

    public static void main (String args[]){
         
        int num = 153; 

        if(isArmstrone(num)){
            System.out.print("Armstrong number ");
        }
        else {
            System.out.print("not armstrone num ber");
        }

    }
}
