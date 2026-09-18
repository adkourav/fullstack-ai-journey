public class halfPyramid {
    public static void  haltpyramid(int n){
        // outer loop 
        for(int i = 1 ; i <= n ; i++){

            // inner loop 
            for(int number = 1 ; number <= i ; number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        haltpyramid(5);

    }
    
}
