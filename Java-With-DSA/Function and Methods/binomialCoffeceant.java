public class binomialCoffeceant {

    public static int factorial(int n){
        int f = 1 ; 
        for (int i = 1 ; i <= n ; i++){
            f = f * i ;
        }
        return f ;
    }
    
    public static int bincoeffi(int n , int r ){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeffi = n_fact/(r_fact * fact_nmr);
        return bincoeffi ; 
    }

    public static void main (String args[]){
        System.out.print(bincoeffi(5,2));
    }
}
