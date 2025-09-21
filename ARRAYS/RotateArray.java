package ARRAYS;

import java.util.Scanner;

public class RotateArray {
    public void solve(int[] arr, int n, int k){
        if(n == 0) return;
        k = k % n;
        if(k > n) return;
        int[] temp = new int[k];
        // inserting elements to temp array.
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
           // shifting remaing elements to 0 index and so on.
        for(int i = 0; i < n-k; i++){
            arr[i] = arr[i+k]; 
        }
            // assembling the array with remaining temp array.
        for(int i = n - k; i < n; i++){
            arr[i] = temp[i - n + k];
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        RotateArray ra = new RotateArray();
        ra.solve(arr, n, k);

        System.out.print("After rotation: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}
