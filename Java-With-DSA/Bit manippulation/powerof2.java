public class powerof2{
    public static boolean ispowerofTwo(int n ){
        return (n & (n-1)) == 0 ;
    }

    public static void main (String args[]){
        System.out.println(ispowerofTwo(15));
    }
}


// i/p :- 8 
//op :- true 

//ip :- 15 
//op :- false 