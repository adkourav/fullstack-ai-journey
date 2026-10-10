// public class RotateArraybyK {
    
// }

// import java.util.*;

public class RotateArray {

    // Reverse part of the array
    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Left rotation
    public static void leftRotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Right rotation
    public static void rightRotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int k = 2;

        // Left rotation
        leftRotate(arr, k);

        System.out.println("Left rotated array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // If you want right rotation,
        // create another array.

        int[] arr2 = {1, 2, 3, 4, 5};

        rightRotate(arr2, k);

        System.out.println("\nRight rotated array:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
