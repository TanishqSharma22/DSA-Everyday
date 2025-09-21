package ARRAYS;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class solution1 {
    public static void divide(int[] nums, int low, int mid, int high){
        ArrayList<Integer> temporary = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // stroing elements in temporary array in sorted manner.
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temporary.add(nums[left]);
                left++;
            }else{
                temporary.add(nums[right]);
                right++;
            }
        }
        // if elements are remaining in left array
        if(left <= mid){
            temporary.add(nums[left]);
                left++;
        }
        // if elements are remaining in left array
        if(right <= high){
            temporary.add(nums[right]);
                right++;
        }
         
         // transfering temporary array to real array.
         for(int i = low; i < high; i++){
            nums[i] = temporary.get(i-low);
         }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low)/2;
        mergeSort(nums, low, mid);       //left array
        mergeSort(nums, mid+1, high);   //right array
        divide(nums, low, mid, high);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Array elements: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Before sorting the array: "+ Arrays.toString(nums));
        mergeSort(nums, 0, n-1);
        System.out.println("After sorting the array: "+ Arrays.toString(nums));
        sc.close();
    }
}
