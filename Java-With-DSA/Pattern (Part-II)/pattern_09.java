// daimond pattern prnt 

public class pattern_09 {
    public static void daimond_pattern (int n){
        //1st half 
        // outer loop 
        for(int i = 1 ; i <= n ; i++ ){
            
            //inner loop for space print 
            for(int j = 1 ; j <= (n-i); j++){
                System.out.print(" ");
            }
            // inner loop for star print 
            for(int j = 1 ; j <= (2*i)-1 ; j++){
                System.out.print("*");
            }
            //line change 
            System.out.println();
        }
        // 2nd half 
        //outer loop 
        for(int i = n ; i >= 1 ; i--){

            // inner loop for space print 
            for(int j = 1 ; j <= (n-i); j++){
                System.out.print(" ");
            }
            // inner loop for star 
            for(int j = 1; j <= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // function call 
    public static void main(String args[]){
        daimond_pattern(10);
    }
    
}
