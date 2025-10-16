package BinarySearch;
import java.util.*;
public class FindSingle {
    public static int singleNonDuplicate(int[] nums){
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] != nums[1]) return 0;
        if(nums[n-1] != nums[n-2]) return n-1;

        int low = 1, high = n-2;
        while(low <= high){
            int mid = (low + high) /2;
            // if answer lies on the middle
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return mid;
            }
            // if not move to the left
            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums = {1,1,3,5,5};
        System.out.println(singleNonDuplicate(nums));
    }
    
}
