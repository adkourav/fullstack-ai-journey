// print the pair of array 
// total pair also 

public class printpair {
    public static void Printpair(int number[]){

        int tp = 0 ; // total pair 
        for(int i = 0 ; i < number.length; i++){
            
            int curr = number[i]; // 2,4,6,8,10

            for(int j = i+1 ; j < number.length; j++){

                System.out.print("("+ curr + "," + number[j] + ")");
                tp++;
            }

            System.out.println();
        }
        System.out.print("total pair :- "+ tp); // print total pair 
    }

    public static void main(String args[]){
        
        int[] number = {2,4,6,8,10};
        Printpair(number);
    }
}
