/*Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]
Output: 3
Explanation: The maximum possible minimum distance between any two 
cows will be 3 when 4 cows are placed at positions [0, 3, 7, 10]. 
Here the distances between cows are 3, 4, and 3 respectively.
 We cannot make the minimum distance greater than 3 in any ways.*/

import java.util.*;
public class AggressiveCow {
    //Function to check if cows can be placed with distance d
    public boolean canPlace(int[] nums, int k, int d) {
        // place first cow at first position
        int count = 1;
        int lastPos = nums[0];
        // loop through the positions
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] - lastPos >= d){
                count++;
                lastPos = nums[i];
            }
            if(count >= k) return true;
        }
        return false;
    }
    public int cows(int[] nums, int k){
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length - 1] - nums[0];
        int ans = 0;
        while(low <= high) {
            int mid = (low + high)/2;
            if(canPlace(nums, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String args[]){
        int[] nums = {0, 3, 4, 7, 10, 9};
        int k = 4;
        AggressiveCow ac = new AggressiveCow();
        System.out.println(ac.cows(nums, k));
    }
}
