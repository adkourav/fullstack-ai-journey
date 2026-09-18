
public class starprint {
    public static void Starprint(int n){
        for(int i = 1 ; i<= n ; i++){
             
            // inner loop 
            for (int star = 1 ; star <= i ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }

    public static void main (String args[]){
        // System.out.print(st)
        Starprint(4);
    }
    
}
