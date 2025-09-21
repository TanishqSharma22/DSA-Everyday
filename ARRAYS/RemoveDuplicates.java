package ARRAYS;

public class RemoveDuplicates {
    public static int duplicates(int[] nums){
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String args[]){
        int[] nums = {0, 0, 3, 3, 5, 6};
        int k = duplicates(nums);

        for(int i = 0; i < k; i++){
            System.out.println(nums[i] + " ");
        }
    }
    
}
