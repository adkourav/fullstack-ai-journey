public class selectionsort {
    public static void Selectionsort(int arr[]){
        // outer loop 
        for (int i = 0 ; i < arr.length-1 ; i++){ // count turns 
            // let minimum possition 

            int minpos = i ; 

            // inner loop 
            for (int j = i+1 ; j < arr.length ; j++ ){ // find the minpos in unsorted array 
                if (arr[minpos] > arr[j]){
                    minpos = j ; 
                }
            }
            //swap 
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp ; 
        }
    }
    // printarray 
    public static void printarr(int arr[]){
        // loop for print 
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        // line change 
        System.out.println();
    }

    // function call 
    public static void main (String args[]){

        int arr[] = {5,4,1,3,2};
        Selectionsort(arr);
        printarr(arr);
    }
    
}
