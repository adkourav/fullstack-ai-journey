// import java.math;
// optimal solution of the prime or not in every where use this solution 

public class primeOptimal {
    public static boolean isprime(int n ){
        if (n == 2 ){
            return true ;
        }

        for (int i = 2 ; i<=Math.sqrt(n); i++){
            if (n % i == 0 ){
                return false;
            }
            
        }
        return true;
    }
    public static void main (String args[]){
        System.out.print(isprime(4));
    }


    
}
