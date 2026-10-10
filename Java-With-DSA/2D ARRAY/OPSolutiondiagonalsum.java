// this is the optimal solution of diagonal sum 
// the time complexity of this = O(n)



public class OPSolutiondiagonalsum {

    public static int diagonalsum(int matrix[][]) { // O(n)

        // create a sum variavle
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // pd
            sum += matrix[i][i];

            // sd

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
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
