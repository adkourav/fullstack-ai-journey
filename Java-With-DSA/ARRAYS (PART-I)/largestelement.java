public class largestelement {

    public static void main (String args[]){
        int[] arr={10 , 40 ,22 , 50 };

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
                // return max;
             }
            
        }
        System.out.println(" largest element = " + max);
    }
    
}
