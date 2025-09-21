package ARRAYS;
import java.util.*;

public class PalindromCheck {
    public boolean palindrom(String s, int i){
        if(i >= s.length()/2){
            return true;
        }
        else if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return palindrom(s, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        PalindromCheck obj = new PalindromCheck();
        boolean isPalindrom = obj.palindrom(word, 0);
        System.out.println(isPalindrom);


        sc.close();
    }
    
}
