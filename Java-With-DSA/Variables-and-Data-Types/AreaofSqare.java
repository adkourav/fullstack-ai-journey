import java.util.*;
public class AreaofSqare {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        int side = sc.nextInt();
        // int sideb = sc.nextInt();

        int area = side*side;
        
        System.out.println(area);

        sc.close();
        
    }
    
}
