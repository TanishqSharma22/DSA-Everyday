/*Input: a = [1, 2, 3, 4, 5], k = 3
Output:6
Explanation: There are many ways to split the array a[] into k consecutive subarrays.
The best way to do this is to split the array a[] into [1, 2, 3], [4], and [5], 
where the largest sum among the three subarrays is only 6. */
import java.util.*;
public class SplitArrayLargeSum {
    public int countPartitions(int[] a, int maxSum) {
     int partitions = 1;
     int subArraySum = 0;
     for(int num : a){
        if(subArraySum + num <= maxSum){
            subArraySum += num;
        } else{
            partitions++;
            subArraySum = num;
        }
     }   
     return partitions;
    }
    public int largestSubArraySum(int[] a, int k){
        int low = Arrays.stream(a).max().getAsInt();
        int high = Arrays.stream(a).sum();

        while(low <= high) {
            int mid = (low + high)/2;
            int partitions = countPartitions(a, mid);
            if(partitions > k){
                low = mid + 1;
            } else{
                high=mid -1;
            }

        }
        return low;
    }
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        SplitArrayLargeSum obj = new SplitArrayLargeSum();
        System.out.println(obj.largestSubArraySum(a, k));
        
    }
    
}
