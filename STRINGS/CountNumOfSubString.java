package STRINGS;

import java.util.*;
public class CountNumOfSubString {
    public static int atMostKDistinct(String s, int k){
        int left = 0 , res = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for(int right = 0; right < s.length(); right ++){
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0)+1);

            while(freq.size() > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) == 0) freq.remove(leftChar);
                left++;
            }
            res = res + (right - left + 1);

        }

        return res;
    }
    public static int countSubstrings(String s, int k){
        return atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
    }
    public static void main(String args[]){
        CountNumOfSubString cnf = new CountNumOfSubString();
        String s = "abcbaa";
        int k = 3;
        System.out.println(cnf.countSubstrings(s, k));

    }
}
    
