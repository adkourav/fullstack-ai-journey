// input or output in array ]

import java.util.*;

public class input {
    public static void main (String args[]){
        // create a array 
        int marks[] = new int[100];
        Scanner sc = new Scanner (System.in);

        // take input 

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // maths

        // output 
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        sc.close();


        
    }
    
}
