package ARRAYS;

public class MajorityElements {
    public static int sortElements(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i]){
                count++;
            }
            else count--;
        }

        int count1 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == element){
                count++;
            }
        }
        if (count > (n/2)) {
            return element;
        }
        return - 1;
    }
    public static void main(String args[]){
        int[] nums = {2, 2, 3, 1, 3, 2, 1, 1};
        int ans = sortElements(nums);
        System.out.print(ans);

    }
    
}
