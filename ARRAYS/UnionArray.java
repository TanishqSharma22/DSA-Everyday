package ARRAYS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionArray {
    public int[] union(int[] num1, int[] num2){
        Set <Integer> union = new HashSet<>();
        // Add all elements from num1
        for(int num : num1 ){
            union.add(num);
        }
        // Add all elements from num2
        for(int num : num2){
            union.add(num);
        }
        // convert the set back to an array
        int[] result = new int[union.size()];
        int i = 0;
        for(int num : union){
            result[i++] = num;
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size:");
        int n = sc.nextInt();
        System.out.print("Enter num1 element :");
        int[] num1 = new int[n];
        for(int i = 0; i < n; i++){
            num1[i] = sc.nextInt();
        }

        System.out.print("Size:");
        int m = sc.nextInt();
        System.out.print("Enter num2 element:");
        int[] num2 = new int[m];
        for(int i = 0; i < m; i++){
            num2[i] = sc.nextInt();
        }

        UnionArray obj = new UnionArray();
        int[] result = obj.union(num1, num2);

        System.out.print("UnionArray:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(" ");
            }
        }
        sc.close();
      }

    
}
