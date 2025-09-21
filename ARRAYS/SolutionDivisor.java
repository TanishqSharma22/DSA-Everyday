package ARRAYS;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class SolutionDivisor{
    public int[] divisors(int n){
        ArrayList<Integer> divisorList = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisorList.add(i);
            }
        }
        // converting arraylist into int array
        Collections.sort(divisorList);
        int[] result = new int[divisorList.size()];
        for(int i = 0; i < divisorList.size(); i++){
            result[i] = divisorList.get(i);
        }
        return result;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        SolutionDivisor sol = new SolutionDivisor();
        int[] output = sol.divisors(n);
        System.out.println("The divisor of "+n+" are :");
        for(int divisor:output){
            System.out.println(divisor);
        }
        sc.close();
        
    }
}