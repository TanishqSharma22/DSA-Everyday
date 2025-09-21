package ARRAYS;

import java.util.*;
public class BubbleSort {
    public int[] sorting(int n, int[] nums){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            }
             System.out.print("After sorting: ");
            for(int k =0; k <n ; k++){
                System.out.print(nums[k] + " ");
            System.out.println();
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n =sc.nextInt();
        System.out.print("Enter the array: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        BubbleSort bs = new BubbleSort();
        int[] s = bs.sorting(n, nums);
        sc.close();
    }
    
}
