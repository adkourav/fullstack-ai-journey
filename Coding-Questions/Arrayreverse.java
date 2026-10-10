// import java.util.*;

// reverse a array in the posetion 

public class Arrayreverse {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // increment or decrement 
            start++;
            end--;

        }

        System.out.print("reverse String is :- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
