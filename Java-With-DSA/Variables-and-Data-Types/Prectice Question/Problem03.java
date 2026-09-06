// Question3:- Enter cost of 3 items from the user (using float data type)-apencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.*;

public class Problem03 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total = pencil+pen+eraser ;

        System.out.println("total cost of the item :- " + Total);

        // add 18 % gst on this bill 

        float finalBill = (Total + (0.18f*Total));

        System.out.println( "Bill after 18% gst " + finalBill);

        sc.close();

    }
    
}
