package STRINGS;
import java.util.*;
public class SumOfBeautySubstring {
    public int beautySum(String s){
        int n = s.length();
        int sum = 0;

        // loop through all substrings
        for(int i = 0; i < n; i++){
            Map<Character, Integer> freq = new HashMap<>();
            for(int j = i ; j < n; j++){


                //increase character frequency
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0)+1);
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                //calculate max and mini frequency
                for(int val : freq.values()){
                    mini = Math.min(mini, val);
                    maxi = Math.max(maxi, val);
                }
                sum += (maxi - mini);
            }

        }
        return sum;
    }
    public static void main(String args[]){
        SumOfBeautySubstring obj = new SumOfBeautySubstring();
        String s = "aabcb";
        System.out.println(obj.beautySum(s));
        
    }
    
}
