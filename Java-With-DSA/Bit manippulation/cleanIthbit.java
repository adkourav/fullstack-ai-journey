
public class cleanIthbit {
    public static int CleanIthbit(int n,int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }    
    public static void main (String args[]){
        System.out.println(CleanIthbit(10, 1));
    }
}
