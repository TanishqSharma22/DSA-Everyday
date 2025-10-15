package BinarySearch;

public class CountOccurence {
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
    public int[] searchRange(int[] nums, int target){
        int first = findFirst(nums, target);
        if(first == -1){
            return new int[] {-1,-1};
        }
        int last = findLast(nums, target);
        return new int[] {first, last};
    }
    public int occurence(int[] nums, int target){
        int[] range = searchRange(nums, target);
        if(range[0] == -1){
            return 0;
        }
        return range[1] - range[0] + 1;
    }
    public static void main(String args[]){
        int[] nums =  {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        CountOccurence obj = new CountOccurence();
        int result = obj.occurence(nums, target);
        System.out.println(result);
    }
    
}
