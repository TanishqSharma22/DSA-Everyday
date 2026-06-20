package ARRAYS;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean check(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return set.size() < nums.length;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        boolean ans = obj.check(nums);
        System.out.println(ans ? "true" : "false");
    }
    
}
