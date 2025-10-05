package ARRAYS;
import java.util.*;
public class CountSubArrayWithK {
    public static int findSubarray(int[] arr, int k){
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0;
        int cnt = 0;

        mpp.put(0, 1); // setting 0 in the map
        for(int i = 0; i < n; i++){
            preSum += arr[i];
            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findSubarray(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
