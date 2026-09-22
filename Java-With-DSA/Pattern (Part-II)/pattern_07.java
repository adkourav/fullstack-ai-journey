// solid Rhombus pattern print 


public class pattern_07 {
    public static void solid_Rhombus(int n ){
        // outer loop for lines 

        for(int i = 1 ; i <= n ; i++){

            // inner loop for space print 
            for(int j = 1 ; j <= (n-i); j++){
                System.out.print(" ");
            }

            // star print 
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // function call 
    public static void main (String args[]){
        solid_Rhombus(5);
    }
    
}
