package ARRAYS;
import java.util.*;
public class HashingQues2 {
    public static void main(String[] args) {
        System.out.println("Enter the alphabets: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

       /*  //percompute
        int[] hash = new int[26];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println("Enter your queries: ");
        int q = sc.nextInt();
        while(q-- > 0){
            char c;
            c = sc.next().charAt(0);
            // fetch
            System.out.println(hash[c - 'a']);
        }  */



        // For uppercase Alphabets-
        int[] hash = new int[256];
        for(int i = 0 ; i < s.length(); i++){
            hash[s.charAt(i)]++;
        }
        System.out.println("Enter your queries");
        int q = sc.nextInt();
        while(q-- > 0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c]); 
        }
        sc.close();
    }
    
}
