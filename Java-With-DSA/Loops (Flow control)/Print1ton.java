import java.util.*;

public class Print1ton {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter yout count :- ");
        int n = sc.nextInt();

        int count = 1;

        while (count <= n ){
            System.out.println(count);
            count++;
        }
        sc.close();

    }
    
}
