/*Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
Output: 0
Explanation: The row with the maximum number of ones is 0 (0 - indexed). */

public class MaxOnes {
    public int lowerBound(int[] arr, int n, int x){
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int maxOnes(int[][] mat, int n, int m){
    
        int cntMax = 0;
        int index = -1;
        for(int i = 0; i < n; i++){
            int cntOnes = m - lowerBound(mat[i], m, 1);
            if(cntOnes > cntMax){
                cntMax = cntOnes;
                index = i;
            }
            }
            return index;
        }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 1 }, { 0, 0, 1 }, { 0, 0, 0 } };
        int n = 3, m = 3;
        MaxOnes obj = new MaxOnes();
        System.out.println(obj.maxOnes(mat, n, m));
    }
    
}
