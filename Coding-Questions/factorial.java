
public class factorial {
    // method 1 simple and easy 
    
    // public static void main (String args[]){
    //     int n = 5 ; 
    //     int fact = 1 ; 

    //     for(int i = 1 ; i<= n ; i++){

    //         fact = fact*i ;

    //         System.out.print(fact +" ");
    //     }
    // }



    // method no 2 :- using method and function 

    public static int Factorial(int n){

        int fact = 1 ; 

        for(int i = 1 ; i<= n ; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main (String args[]){

        System.out.println(Factorial(5));
    }
}
