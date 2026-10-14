
public class getIthBit {
    
    public static int getIthbit(int n , int i){

        int BitMask = n<<i ; 

        if ((n & BitMask) == 0 ){
            return 0 ;
        }
        else {
            return 1 ; 
        }
    }

    public static void main (String args[]){
        System.out.println(getIthbit(5, 0));
    }
}
