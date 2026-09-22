public class inverted_star{
    public static void inverterdstar(int n ){

        // outer loop 
        for(int i = 1 ; i <= n ; i++){

            // inner loop 

            for(int j = 1 ; j <= (n-i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        inverterdstar(4);
    }
}