// tax calculate 1:- income<= 5l -> 0% ; 
// 2:- income b/w 5 - 10 l -> 20% ;
// 3:- income > 10 l :- 30 % ;

import java.util.*;
public class taxCalculate {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int tax;

        int income = sc.nextInt();

        if (income <= 500000){
            System.out.println("no tax , 0% tax");
        }
        else if (income >= 500000 && income <= 1000000 ){
            // tax = income*0.2;  type cast problem 
            tax = (int)(income * 0.2);
            System.out.println(tax);
        }
        else {
            tax = (int)(income*0.3);
            System.out.println("your tax is "+ tax);
        }
        sc.close();
    }
    
}
