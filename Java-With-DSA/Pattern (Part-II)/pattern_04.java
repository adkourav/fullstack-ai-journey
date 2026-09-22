
// FLOYD'S TRIANGLE 
import java.util.*;

public class pattern_04 {
    public static void floyd_triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        sc.close();
        int counter = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floyd_triangle();
    }

}
