package BinarySearch;

public class RotatedSearch {
    public int search(int[] nums, int k){
        int low = 0, high = nums.length -1;
        while(low <= high){
            int mid = (low + high)/2;
            // if mid is the target
            if(nums[mid] == k) return mid;
            // if left part is sorted
            if(nums[low] <= nums[mid]){
                // if target is in the left sorted part
                if(nums[low] <= k && k <= nums[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }
            else{
                    // if target is in the right sorted part
                    if(nums[mid] <= k && k <= nums[high]){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }
            }
        
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        RotatedSearch rs = new RotatedSearch();
        System.out.println(rs.search(nums, k));
    }
    
}
