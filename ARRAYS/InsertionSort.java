package ARRAYS;

import java.util.*;
public class InsertionSort {
    static void sorting(int n, int[] arr){
        for(int i = 1; i < n; i++){
            int current = arr[i];
            int j = i-1;
            while( j >= 0 && current < arr[j] ){
                arr[j+1] = arr[j];
                j--;

                // Placement
                arr[j+1] = current;
            }
        }
        System.out.print("After sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort is = new InsertionSort();
        is.sorting(n, arr);
        sc.close();
        
    }
    
}
