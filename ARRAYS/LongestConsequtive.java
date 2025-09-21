package ARRAYS;

import java.util.*;
public class LongestConsequtive {
    public int findLongestConsequtive(int[] arr){
        int n = arr.length;
        if(n == 0) return 0;
        Set<Integer> numbers = new HashSet<>();
        for(int num : arr){
            numbers.add(num);
        }
        int longest = 0;

        // Check for each number if it is the start of a sequence
        for(int num : numbers){
            if(!numbers.contains(num-1)){
                int currentNum = num;
                int count = 1;

                // Count how long is the Consecutive sequence
                while(numbers.contains(currentNum+1)){
                    currentNum ++;
                    count ++;
                }
                // Update the longest 
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String args[]){
        int[] arr = {100, 200, 1, 2, 3, 4};
        LongestConsequtive lc = new LongestConsequtive();
        int result = lc.findLongestConsequtive(arr);
        System.out.println(result);

    }
    
}
