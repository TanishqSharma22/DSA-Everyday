package ARRAYS;

public class LongestSubarray {
    public static int getLongestSub(int []nums, long k) {
        int n = nums.length;

        int left = 0, right = 0;  // 2 pointers
        long sum = nums[0];
        int maxLength = 0;

        while(right < n){

            while(left <= right && sum > k){
                sum = sum - nums[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left +1);
            }
            right++;
            if(right < n) sum += nums[right];
        }
        return maxLength;
    }

    public static void main(String args[]){
        int nums[] ={10, 5, 2, 7, 1, 9};
        int k = 10;

    
        int output = getLongestSub(nums, k);
        System.out.print(output);

    }
    
}
