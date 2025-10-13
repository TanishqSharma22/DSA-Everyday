package BinarySearch;

public class BSsortedArray {
    // recursive Approach
    /*public int binearySearch(int[] nums, int low, int high, int target){
        if(low > high) return -1;

        int mid = (low + high)/2;
        if(nums[mid] == target) return mid;
        else if(target > nums[mid])
        return binearySearch(nums, mid+1, high, target);
        return binearySearch(nums, low, mid-1, target);
    }
    public int search(int[] nums, int target){
        return binearySearch(nums, 0, nums.length-1, target);
    }
    public static void main(String args[]){
        int[] nums ={3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        BSsortedArray obj = new BSsortedArray();
        int ans = obj.search(nums, target);
        if(ans == -1){
            System.out.println("Not present");
        }
        else{
            System.out.println(ans);
        }

    }*/


    // Iterative Approach
    public static int BinarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]){
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums ={3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ans = BinarySearch(nums, target);
        if(ans == -1){
            System.out.println("Not present");
        }
        else{
            System.out.println(ans);
        }
    }
}
