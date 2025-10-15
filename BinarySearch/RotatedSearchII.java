package BinarySearch;

public class RotatedSearchII {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = mid+1;
                high = mid-1;
                continue;
            } 
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] >= target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }  
            }
            else{
                if(nums[mid] <= target && nums[high] >= target){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 9;
        RotatedSearchII obj = new RotatedSearchII();
        System.out.println(obj.search(nums, target));
    }
    
}
