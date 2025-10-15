package BinarySearch;

import java.util.Arrays;

public class FirstLast {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        if(first == -1 || last == -1){
            return new int[] {-1,-1};
        }
        return new int[] {first, last};
    }
    public int findFirst(int[] nums, int target){
        int low = 0, high = nums.length -1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;  // >> Move left
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    public int findLast(int[] nums, int target){
        int low = 0, high = nums.length -1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1; // >> Move right
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return ans;

    }
        
    public static void main(String args[]){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FirstLast obj = new FirstLast();
        int[] result = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(result));

    }
     
}
