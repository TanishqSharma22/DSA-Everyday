package BinarySearch;

import java.util.*;

public class LowerBound {
    public int sort(int[]nums, int x){
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {1,3,3,5,7,9};
        int x = 3;
        LowerBound obj = new LowerBound();
        System.out.println(obj.sort(nums, x));
    }
    
}
