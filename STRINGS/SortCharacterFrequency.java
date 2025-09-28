package STRINGS;
import java.util.*;

public class SortCharacterFrequency {
    public String frequencysort(String s){
        // Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        // Bucket array where index = frequency
        List<Character>[] bucket = new List[s.length()+1];
        for(char ch : freq.keySet()){
            int f = freq.get(ch);
            if(bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(ch);
        }
        // Build result from high freq to low
        StringBuilder sb = new StringBuilder();
        for(int i = s.length(); i > 0; i--){
            if(bucket[i] != null){
                for(char ch : bucket[i]){
                    for(int j = 0; j < i; j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        SortCharacterFrequency scf = new SortCharacterFrequency();
        String s = "tree";
        System.out.println(scf.frequencysort(s)); 
    }
    
}
