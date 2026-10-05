import java.util.*;

public class create2Darray {
    // create array
    public static void main(String args[]) {
        // create matrix
        int matrix[][] = new int[3][3];

        int n = matrix.length, m = matrix[0].length;

        // take input from user
        System.out.print("enter the element :- ");
        Scanner sc = new Scanner(System.in);
        // sc.close();

        // traverse every row

        for (int i = 0; i < n; i++) {
            // traverse in col
            for (int j = 0; j < m; j++) {
                // take input form user
                matrix[i][j] = sc.nextInt();
            }
        }

        // output the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
