// Display all numbers entered by user expect multiple by 10  

import java.util.*;

public class Continue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        do {
            System.out.print("Enter the number:- ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was :- " + n);

        } while (true);
        
    }
    

}
