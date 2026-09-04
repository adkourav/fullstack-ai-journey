// Question5:- Write a Java program that takes a year from the user and print whether that year is a leap year or n

import java.util.*;
public class problem5 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter year :- ");
        int year = sc.nextInt();

        if (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0 )){
            System.out.println(year + "  is a leep year ");
        }
        else {
            System.out.println(year + "  is not a leep year ");
        }
        sc.close();
    }
    
}
