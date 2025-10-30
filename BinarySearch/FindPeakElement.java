package BinarySearch;

public class FindPeakElement {
    public int peakElement(int[] nums){
        int low = 0, high = nums.length -1;
        while(low < high){
            int mid  = (low + high)/2;
            
            if(nums[mid] > nums[mid + 1]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int[] nums = {1,2,1,3,5,6,4};
        FindPeakElement obj = new FindPeakElement();
        System.out.println(obj.peakElement(nums));
        
    }
}
