public class Duplicateremove {

    public static void main (String args[]){
        int arr [] = {1,1,2,3,3,4,5};

        int j = 0 ; 

        for(int i = 0; i < arr.length ; i++){

            if(arr[i]!= arr[j]){

                j++;

                arr[j] = arr[i];
            }
        }
        System.out.print("Array after remove duplicate ;- ");

        for(int i = 0 ; i <= j ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}