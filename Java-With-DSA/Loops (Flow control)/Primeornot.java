import java.util.*;

public class Primeornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 2) {
            System.out.println("n is prime number");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % 1 == 0) { // n is a multiple of i (i is not equal to 1 to n)

                    isprime = false;

                }
            }
            if(isprime == true){
                System.out.println("n is prime ");
            }
            else{
                System.out.println("n is not prime ");
            }
        }
    }

}
