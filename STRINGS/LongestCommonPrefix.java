package STRINGS;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String commonPrefix(String[] s){
        if(s == null || s.length == 0) return "";
        
        StringBuilder result = new StringBuilder();
        Arrays.sort(s);

        char[] first = s[0].toCharArray();
        char[] last = s[s.length-1].toCharArray();

        for(int i = 0; i < first.length && i < last.length; i++){
            if(first[i] != last[i]){
                break;

            }
            result.append(first[i]);
        }
        return result.toString();

    }
    public static void main(String args[]){
        String[] s ={"flowers" , "flow" , "fly", "flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.commonPrefix(s));
    }
    
}
