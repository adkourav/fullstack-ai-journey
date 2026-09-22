// find the product of the a & b 

public class product {
    public static int multiply(int a , int b ){
        int product = a * b ;
        return product;
    }

    public static void main (String args[]){
        int a = 5 ; 
        int b = 3 ; 

        int prod  = multiply(a,b);
        System.out.println("a * b :- " + prod);

        prod = multiply(10,14);
        System.out.println("a2 * b2 :- " + prod);
    }
    
}
