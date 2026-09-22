import java.util.*;

public class Calculater {
    public static void calculatesum(){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b ;

        System.out.println("sum is :- " + sum);

        sc.close();
    }

    public static void main(){
        calculatesum();
    }
    
}
