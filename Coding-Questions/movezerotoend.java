public class movezerotoend {
    public static void main(String args[]) {

        int arr[] = { 0, 1, 3, 0, 12 };
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                // swapm

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

            // for(i=0 ; i < arr.length ; i++){
            // System.out.print(arr[i]+ " ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
