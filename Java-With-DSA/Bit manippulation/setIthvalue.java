
// public class setIthbit {
//     public static int SetIthbit(int n , int i ){
//         int BitMask =  1<<i;
//         return n | BitMask;
//     }    
//     public static void main (String args[]){
//         System.out.println(SetIthbit(10 , 2));
//     }
// }


public class setIthvalue{

    public static int setIthbit(int n , int i ){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main (String args[]){
        System.out.println(setIthbit(10, 2));
    }
}