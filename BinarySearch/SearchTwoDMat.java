
/*Input: mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
Output: True
Explanation: The target = 8 exists in the 'mat' at index (1, 3). */

public class SearchTwoDMat {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;  //col
        int low = 0;
        int high = n*m-1;

        while(low <= high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;

            if(matrix[row][col] == target){
                return true;

            } else if(matrix[row][col] < target){
                low = mid + 1;

            } else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
        int target = 8;
        System.out.println(searchMatrix(mat, target));
    }
    
}
