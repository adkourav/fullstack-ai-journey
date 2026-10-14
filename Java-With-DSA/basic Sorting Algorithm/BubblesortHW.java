// in this code we have already sorted array 


public class BubblesortHW {
    // create a bubble sort function 
    
    public static void bubblesort(int arr[]){
        // outer loop 

        for(int turn = 0 ; turn<arr.length-1 ; turn++){

            //create swap fro count swap 
            // int swap = 0 ;

            // inner loop 
            for(int j=0 ; j<arr.length-1-turn; j++){
                // if condetion 
                if(arr[j] > arr[j+1]){

                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    j++;
                    
                                   
                }
                // swap = swap+j ; 
                //     System.out.print("swap :-"+ swap);
                //     // return swap ;  
            }
        }
        
    }


    // create a function for prnt arr 

    public static void printarr(int arr[]){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[]= {1,2,3,4,5};

        bubblesort(arr);

        printarr(arr);

        // System.out.print(swap);
    }
}
