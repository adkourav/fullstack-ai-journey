public class binomialcoefficient {
    // factorial code 
    
    public static int factorial(int n ){
        int fact = 1 ;
        for(int i =1 ; i <= n; i++){
            fact = fact*i ;

        }
        return fact;
    }

    // binomial coefficeant 

    public static int binocoeff(int n , int r ){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial((n-r));

        int binocoef = n_fact/(r_fact*(nmr_fact));
        return binocoef;
    }

    public static void main (String args[]){
        System.out.println(binocoeff(5,2 )); 
    }
}
