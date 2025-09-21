package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class LongestArraySumK {
    public static int getLongetSubarray(int[] a, int k){
        int n = a.length;
        Map< Integer, Integer> preSumMap = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            sum += a[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            // calculate the sum of remianing part
            int remianing = sum - k;

            if(preSumMap.containsKey(remianing)){
            int length = i - preSumMap.get(remianing);
            maxLen = Math.max(maxLen, length);
        }
        if(!preSumMap.containsKey(sum)){
            preSumMap.put(sum, i);
        }
     }
        return maxLen;
    }
    public static void main(String args[]){
        int a[] = {-1, 1 , 1};
        int k = 1;

        LongestArraySumK obj = new LongestArraySumK();
        int output = obj.getLongetSubarray(a, k);
        System.out.print(output);
    }
    
}
