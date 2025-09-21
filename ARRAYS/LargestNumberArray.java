package ARRAYS;

import java.util.Scanner;
public class LargestNumberArray {
    public int sort(int[] arr){
        int max = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                 max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }

        LargestNumberArray la = new LargestNumberArray();
        int result = la.sort(arr);
        System.out.println("larger array: "+result);
        sc.close();
    }
    
}
