package BinarySearch;

public class UpperBound {
    public static int sort(int[] nums, int x){
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {3,5,8,15,19};
        int x = 9;
        System.out.println(sort(nums, x));
    }
    
}
