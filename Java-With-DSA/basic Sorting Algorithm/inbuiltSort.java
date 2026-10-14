import java.util.*;

public class inbuiltSort {
    
    // main function 

    public static void main (String args[]){

        int arr[] = {3,1,5,4,2};
        
        // Assending order 
        Arrays.sort(arr);

        // for desecndong order we use collections 
        // if you want to use a Collection to sort your array in decending form so you want to create a capital later Integer arr not only int 

        // create nuw arrat 

        Integer arr2[] = {2,1,2,4,3,5,4};
        Arrays.sort(arr2,Collections.reverseOrder());

        System.out.print("Deccending order :- ");
        System.out.println(Arrays.toString(arr2));


        System.out.println("Accending order:- "+ Arrays.toString(arr));
    }
}