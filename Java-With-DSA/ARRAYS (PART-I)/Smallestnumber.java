// find the smallest number in array 

public class Smallestnumber {
    public static int getSmallest (int number[]){
        int smallest = Integer.MAX_VALUE;

        for (int i = 0 ; i < number.length; i++){
            if (smallest > number[i]){
                smallest = number[i];

            }
        }
        return smallest ; 

    }
    public static void main(String args[]){
        int number[] = {2,4,6,1,3,5};

        System.out.println("smallest number in array ;- " + getSmallest(number));
    }
    
}
