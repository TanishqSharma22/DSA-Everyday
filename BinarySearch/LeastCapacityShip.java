/*Input: weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5
Output: 15
Explanation: Minimum ship capacity = 15. One way to ship in 5 days:
Day 1: 1 + 2 + 3 + 4 + 5 = 15
Day 2: 6 + 7 = 13
Day 3: 8
Day 4: 9
Day 5: 10*/
import java.util.*;
public class LeastCapacityShip {
    // days needed
    public int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;
        for(int w : weights) {
            if(currentLoad + w > capacity){
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low < high){
            int mid = (low + high)/2;
            int needed = daysNeeded(weights, mid);
            if(needed <= days){
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        LeastCapacityShip lcs = new LeastCapacityShip();
        System.out.println(lcs.shipWithinDays(weights, days));
        
    }
    
}
