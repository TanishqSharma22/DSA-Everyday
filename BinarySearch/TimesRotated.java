package BinarySearch;

import ARRAYS.Solution;

public class TimesRotated {
    public static int countRotations(int[] nums){
        int low = 0, high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[low] <= nums[high]){
                if(nums[low] < ans){
                    index = low;
                    ans = nums[low];
                }
                break;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] < ans){
                    index = mid;
                    ans = nums[low];
                }
                low = mid + 1;
            }
            else{
                if(nums[mid] < ans){
                    if(nums[mid] < ans){
                        index = mid;
                        ans = nums[mid];
                    }
                }
            }
        } 
        return index;
    }
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        TimesRotated sol = new TimesRotated();
        System.out.println(sol.countRotations(arr));

    }
    
}
