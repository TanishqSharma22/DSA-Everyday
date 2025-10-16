package BinarySearch;
import java.util.*;
public class MinimumRotated {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length -1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }

            if(nums[low] <= nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }else{
                ans= Math.min(ans, nums[mid]);
                high = mid -1;
            }
            }
            return ans;
        }
    
    public static void main(String args[]){
        int[] nums =  {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findMin(nums));
    }
    
}
