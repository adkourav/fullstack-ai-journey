public class oddoreven{
    public static void Oddoreven(int n){

        int BitMask = 1 ; 

        if((n & BitMask) == 0){
            System.out.println("even number ");
        }else {
            System.out.println("odd number ");
        }
    }
    public static void main(String args[]){
        Oddoreven(3);
        Oddoreven(14);
        Oddoreven(17);
    }
}