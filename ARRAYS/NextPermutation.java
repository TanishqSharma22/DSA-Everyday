package ARRAYS;
import java.util.*;
class NextPermutation{
    public void nextPerm(int[] nums){
        int n = nums.length;

        // find 1st decreasing element
        int i = n-2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }

        //find the element just larger then nums[i] and Swap
        if(i >= 0){
            int j = n-1;
            while(nums[j] <=nums[i]){
                j--;
            }
            swap(nums,i,j);

        }

        reverse(nums, i+1, n-1);
    }
    private void  swap(int[]nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int[] nums, int l, int r){
        while(l < r)
        swap(nums, l++, r--);
    }
    public static void main(String args[]){
        NextPermutation np = new NextPermutation();
        int[] nums = {1,2,3};
        np.nextPerm(nums);
        System.out.println(Arrays.toString(nums));
    }
}