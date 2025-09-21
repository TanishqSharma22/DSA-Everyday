package ARRAYS;
import java.util.*;
public class Solution {
    public void printNumbers(int startsFrom, int number){
        if(startsFrom>=number){
            return;
        }
        printNumbers(startsFrom+1, number);
        System.out.println(startsFrom);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER: ");
        int number =sc.nextInt();
        
        Solution sol = new Solution();
        sol.printNumbers(1, number);
        sc.close();

        
    }
    
}
