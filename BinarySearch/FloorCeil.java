package BinarySearch;

import java.util.Arrays;

public class FloorCeil {
    static int findFloor(int[] nums, int x){
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    static int findCeil(int[] nums, int x){
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int[] getFloorandCeil(int[] nums, int x){
        int f = findFloor(nums, x);
        int c = findCeil(nums, x);
        return new int[] {f,c};

    }
    public static void main(String args[]){
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.println(Arrays.toString(getFloorandCeil(nums, x)));
    }
    
}
