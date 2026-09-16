import java.util.*;

public class primeorNot {

    public static boolean isprime(int n) {
        // corner cases
        if (n == 2) {
            return true;
        }

        boolean isprime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {// completely divided 
                return false;
            }
        }
        return isprime;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }

}
