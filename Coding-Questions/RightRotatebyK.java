// rotate the array in right sight from the K posetion 

public class RightRotatebyK {
    public static void reverse(int[] arr, int start, int end) {
        // while loop
        while (start < end) {

            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rightrotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

    }

    // main function

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;

        rightrotate(arr, k);

        System.out.print("Right rotate array is :- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
