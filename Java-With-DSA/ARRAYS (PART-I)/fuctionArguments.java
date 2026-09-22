// passing arrays as arguments 


// import java.util.*;
public class fuctionArguments {
    // add nonchangable variable 
    public static void update(int marks[],int unchangable){
        unchangable = 10;
        for(int i = 0 ; i <marks.length; i++){
            
            //update marks 
            marks[i] = marks[i]+1;
        }
    }
    
    public static void main(String args[]){
        int marks[]={97,98,99};
        int unchangable = 5 ; 
        update( marks , unchangable);
        System.out.println(unchangable);

        //print your marks 
        for(int i = 0 ; i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}
