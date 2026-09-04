// Question1:- Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.*;
public class Problem1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0){
            System.out.println("num is posetive ");
        }
        else {
            System.out.println("num is negative :");
        }
        sc.close();
    }
    
}
