package ARRAYS;

import java.util.Scanner;

public class SecondLargestArray {
    public int secondLargestElement(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        SecondLargestArray obj = new SecondLargestArray();
        System.out.println("Second lasrgest element: "+ obj.secondLargestElement(nums));
        sc.close();
     }
}
