package ARRAYS;
import java.util.*;

public class RearrangePosNeg {
    public int[] rearrangeArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        int pos = 0, neg = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {3,1,-2,-5,2,-4};
        RearrangePosNeg obj = new RearrangePosNeg();
        int[] result = obj.rearrangeArray(nums);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}

    