package ARRAYS;
import java.util.*;
public class Leaders {
    public static ArrayList<Integer> findLeader(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;
        int max = nums[n-1];
        ans.add(nums[n-1]);

        for(int i = n-2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> ans = findLeader(nums);
        Collections.sort(ans, Collections.reverseOrder()); 
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    
}
