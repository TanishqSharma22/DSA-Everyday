
//func to cal total hours 

import java.util.Arrays;

public class KokoBanana {
    //func to cal total hours 
    public int CalTotalHour(int[] nums, int speed){
    int totalHour = 0;
    for(int banana : nums){
        totalHour = totalHour + (int)Math.ceil((double)banana/speed);
    }
    return totalHour;
}
// func to find min speed
public int minSpeed(int[] nums, int h){
    int maxNums = Arrays.stream(nums).max().getAsInt();
    int low = 1, high = maxNums;
    int ans = maxNums;
    while(low <= high){
        int mid = (low + high)/2;
        int totalHour = CalTotalHour(nums, mid);
        if(totalHour <= h){
            ans = mid;
            high = mid - 1;
      } else{
        low = mid+1;
      }
    }
    return ans;
}
    public static void main(String args[]){
        int[] nums = {7,15,6,3};
        int h = 8;
        KokoBanana obj = new KokoBanana();
        int result = obj.minSpeed(nums, h);
        System.out.println("Minimum Eating Speed: " + result);
    }
    
}
