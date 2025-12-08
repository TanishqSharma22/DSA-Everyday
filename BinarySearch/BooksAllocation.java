/*Input: nums = [12, 34, 67, 90], m=2
Output: 113
Explanation: The allocation of books will be 12, 34, 67 | 90.
One student will get the first 3 books and the other will get the last one. */

import java.util.*;
public class BooksAllocation {
    public int countStudents(int[] nums, int page){
        int students = 1;
        long currentPages = 0;
        for(int n : nums){
            if(currentPages + n <= page){
                currentPages = currentPages + n;
            } else{
                students++;
                currentPages = n;
            }
        }
        return students;
    }
    public int findPages(int[] nums, int m) {
        int n = nums.length;
        if(m>n) return -1;

        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high){
            int mid = (low + high)/2;
            int students = countStudents(nums, mid);
            if(students > m){
                low = mid + 1;
            } else {
                 high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String args[]) {
        int[] nums = {12, 34, 67, 90};
        int m = 2;
        BooksAllocation ba = new BooksAllocation();
        System.out.println(ba.findPages(nums, m));
    }
}
