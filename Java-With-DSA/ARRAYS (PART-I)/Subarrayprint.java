// subarray print 

// import java.util.*;
public class Subarrayprint {

    public static void printsubarray(int num[]){
        int ts = 0 ; // total subarray 
        for(int i = 0 ; i < num.length; i++){
            int start = i ; 

            for(int j = i ; j < num.length; j++){
                int end = j ;

                for(int k=start ; k<= end ; k++){ //print 
                    System.out.print(num[k] + " ");

                }
                ts++ ; // increment in ts 
                System.out.println();


            }
            System.out.println();
        }
        System.out.println("Total Subarray :- " + ts);
    }

    public static void main (String args[]){
        int[] num = {2,4,6,8,10};

        printsubarray(num);
    }
    
}
