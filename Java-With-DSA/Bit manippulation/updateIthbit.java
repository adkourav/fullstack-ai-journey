// givin :- 0 , 1  , Ith bit 
// what we do :- i + (clear , set )
public class updateIthbit {
    public static int CleanIthbit(int n, int i) {
        int BitMask = ~(1 << i);
        return n | BitMask;

    }

    // set bit function
    public static int SetIthbit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;

    }

    // direct code
    public static int UpdateIthbit(int n, int i, int Newbit) {
        // direct update
        if (Newbit == 0) {
            return CleanIthbit(n, i);
        } else {
            return SetIthbit(n, i);
        }

        // logical update

        // n = CleanIthbit(n , i);

        // int Bitmask = Newbit<<i;
        // return n | Bitmask;
    }

    public static void main(String args[]) {
        System.out.println(UpdateIthbit(10, 2, 1));
    }

}
