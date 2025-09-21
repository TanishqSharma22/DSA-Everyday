package ARRAYS;
import java.util.*;
public class SetMatrixZero{
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean firstColZero = false;

        // mark the first row and col
        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0) firstColZero = true;
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColZero){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String args[]){
        SetMatrixZero sm = new SetMatrixZero();
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        sm.setZeroes(matrix);

        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
    }
}
}

