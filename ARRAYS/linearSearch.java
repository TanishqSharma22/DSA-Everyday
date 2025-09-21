package ARRAYS;
import java.util.*;

class linearSearch {
    public int search(int nums[], int target) {
        //Your code goes here
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the elements of array: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){ // Corrected loop condition
            nums[i] = sc.nextInt();
        } 

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        linearSearch sol = new linearSearch();
        int result = sol.search(nums, target);

        if(result == -1){ // Corrected comparison
            System.out.print("Element not found.");
        } else {
            System.out.print("Element found at index " + result);
        }

        sc.close();
    }
}