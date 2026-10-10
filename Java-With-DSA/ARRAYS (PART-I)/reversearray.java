public class reversearray {
    public static void main(String args []){

        // create a array 
        int[] arr = {10 , 20 , 30 , 40 ,50 };

        // create a variable 

        int start = 0 ; 
        int end = arr.length - 1 ; 

        // loop 

        while(start < end ){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //increment 
            start ++;

            // decrement in end 

            end--;
        }
        // for loop with condetion 

        for( int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
