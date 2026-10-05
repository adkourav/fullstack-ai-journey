import java.util.*;

public class searchElement{
    public static boolean search(int matrix[][], int key ){
        for (int i = 0 ; i< matrix.length; i++){
            for (int j = 0 ; j < matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.println("found at cell ("+ i + ","+ j+")");
                    return true;
                }
            }
        }
        System.out.print("key not found ");
        return false ;
    }

    public static void main (String args[]){
        int matrix [][] = new int[3][3];

        Scanner sc = new Scanner (System.in);
        for(int i = 0 ; i<matrix.length; i++){
            for (int j = 0 ; j < matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }
        sc.close();

        // output 
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,9);

    }
}