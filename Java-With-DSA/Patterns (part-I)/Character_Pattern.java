import java.util.*;

public class Character_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // sc.close();
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
         sc.close();
    }
}