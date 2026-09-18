public class LinearSearch {
    public static int linearsearch (int number[], int key){

        // write a loop for find the key 
        for(int i = 1 ; i<number.length; i++){
            if(number[i] == key){
                return i ;
            }
        }
        return -1;

    }

    public static void main(String args[]){
        // array 
        int number[]={2,4,6,8,10,12,16};
        int key = 20;

        int index = linearsearch(number, key);
        if(index == -1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("key is at index:- "+index);
        }
    } 
    
}
