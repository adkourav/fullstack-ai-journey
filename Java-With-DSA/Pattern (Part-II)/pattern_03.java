// inverted half_pyramid with number 

public class pattern_03 {
    public static void inverted_half_pyramid_number(int n){
        // outer loop for lines 
        for(int i = 1; i <= n; i++ ){
            //inner loop for print 
            for(int j = 1; j <= n-i+1; j++){
                // print number 
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        inverted_half_pyramid_number(5);
    }
    
}
