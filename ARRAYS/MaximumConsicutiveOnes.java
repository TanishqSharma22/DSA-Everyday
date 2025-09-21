package ARRAYS;

public class MaximumConsicutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max_cnt = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cnt++;
            } else{
                cnt = 0;
            }

            max_cnt = Math.max(max_cnt, cnt);
        }
        return max_cnt;
        
    }

    public static void main(String args[]){
        int nums[] = {1, 1, 0, 0, 1, 1, 1, 0};

        MaximumConsicutiveOnes obj = new MaximumConsicutiveOnes();

        int output = obj.findMaxConsecutiveOnes(nums);
        System.out.print(output);
    }
    
}
