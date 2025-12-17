/*Input: matrix = [ [1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30] ], target = 5

Output: True

Explanation: The target 5 exists in the matrix in the index (1,1) */

public class SearchTwoDMat2 {
    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;
        while(row < n && col >= 0){
            if(matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] < target){
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchTwoDMat2 obj = new SearchTwoDMat2();
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found in matrix: " + result);
    }
    
}
