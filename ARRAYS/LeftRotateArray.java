package ARRAYS;

import java.util.Scanner;

class LeftRotateArray{
    public static void rotateArray(int[] arr, int n){
        int temp = arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i  = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        rotateArray(arr, n);
        sc.close();



    }
}