// function overloading using parameter 

public class functionoverloading {
    // fun to calculate sum of 2 num 
    public static int sum (int a , int b ){
        return a + b;
    }

    // fun to calculate sum of 3 num 

    public static int sum (int a , int b , int c){
        return a + b + c ;
    }

    public static void main (String args[]){
        // System.out.print(sum(5 , 2 , 5));
        System.out.print(sum (4 , 5));
    }
    
}
