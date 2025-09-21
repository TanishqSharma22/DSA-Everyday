package ARRAYS;
import java.util.*;

public class TwoSumM {
    public static int[] greedy(int []nums, int target){
        Map<Integer, Integer> check = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++){

            int a = nums[i];
            int result = target - a;

            
            if(check.containsKey(result)){
                return new int[]{check.get(result), i};
            }
            check.put(a, i);
        }
        return new int[]{};



    }
    public static void main(String args[]){
        int nums[] = {1,6,2,10,3};
        int target = 7;
       
        int[] output = greedy(nums, target);

        if(output.length > 0){
            System.out.print(Arrays.toString(output));
        }else{
        System.out.println("no");}

    }
    
}
