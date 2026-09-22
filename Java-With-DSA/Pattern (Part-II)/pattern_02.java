// IIverter Rotate half_ pyramid star ptint  
public class pattern_02 {
    public static void inverted_rotate_half_pyramid(int n) {

        // outer loop for lines / row count
        for(int i = 1; i <= n; i++) {

            // inner loop for space print
            for(int j = 1; j <= n-i; j++) {
                // print space
                System.out.print(" ");
            }
            // one more inner loop for print star
            for(int j = 1; j <= i; j++) {
                // print the star
                System.out.print("*");
            }
            // change the line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_rotate_half_pyramid(4);
    }

}
