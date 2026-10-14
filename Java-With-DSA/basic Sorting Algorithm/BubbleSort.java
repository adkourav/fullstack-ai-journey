
public class BubbleSort {

    // create a function for bubble sort 
    public static void bubblesort(int arr[]){
        // outer loop 

        for(int turn = 0 ; turn < arr.length-1 ; turn++){
            // inner loop 

            for(int j = 0 ; j < arr.length-1-turn ; j++){
                // if condetion 
                if(arr[j]>arr[j+1]){

                    // swap 

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }

    // create a function for print array 

    public static void printarray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){

            System.out.print(arr[i]+ " ");
        }
        //line change 

        System.out.println();
    }

    // create a main function for call methos 
    public static void main(String args[]){

        int arr[]= {5,4,4,1,1,3,2};

        bubblesort(arr);

        printarray(arr);
    }
    
}
