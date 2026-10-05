// this the not a optimal solution of the diagonal sum 
// it is the brute force method we are traverse in every elment or index 

// the time complexity of this code is :- O(n^2)

public class digonalsumbruteforce {
    public static int diagonalsum(int matrix[][]) {  // O(n^2)

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                // for pd
                if (i == j) {
                    sum += matrix[i][j];
                }
                // for secondary daigonal
                else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // print matrix
    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(diagonalsum(matrix));        
    }
}
