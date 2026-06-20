package ARRAYS;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] product(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1] * nums[i-1];  // ✅ Fix 1
        }

        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }

    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4};
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] ans = obj.product(nums);
        System.out.print(Arrays.toString(ans));  // ✅ Fix 2 & 3
    }
}