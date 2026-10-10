public class ArrayReverse {
    
    public static void ReverseArray(int number[]){
        int start = 0 ; 
        int end = number.length - 1 ; 

        while(start < end){
            // swap 

            int temp = number[start];
            number[start] = number[end];
            number[end] = temp; 

            start++; 
            end--; 
        }
    }

    public static void main (String args[]){
        int number[] = {1,2,3,4,5};

        ReverseArray(number);

        // print array 

        for (int i = 0 ; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        // line change 

        System.out.println();
    }
}
