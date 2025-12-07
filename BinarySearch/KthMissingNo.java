
/* Input: arr = [3, 5, 7, 10], k = 6
   Output: 9
   Explanation: The missing numbers are [1, 2, 4, 6, 8, 9, 11, ...]. The 6ᵗʰ missing number is 9.*/

public class KthMissingNo {
    public int missingElement(int[] arr, int k){
        int low = 1, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String args[]) {
        int[] arr = {3, 5, 7, 10};
        int k = 6; 
        KthMissingNo obj = new KthMissingNo();
        System.out.println(obj.missingElement(arr, k));
    }
}
