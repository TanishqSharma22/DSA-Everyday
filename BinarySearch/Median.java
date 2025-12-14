/*Input: arr1 = [2, 4, 6], arr2 = [1, 3, 5]
Output: 3.5
Explanation: The array after merging arr1 and arr2 will be [ 1, 2, 3, 4, 5, 6 ]. 
As the length of the merged list is even, the median is the average of the two middle elements. 
Here two medians are 3 and 4. So the median will be the average of 3 and 4, which is 3.5. */

public class Median {
    public double findMedian(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return findMedian(nums2, nums1);

        int n1 = nums1.length, n2 = nums2.length;
        int low = 0, high = n1;
        while(low <= high){
            int cut1 = (low + high)/2;
            int cut2 = ((n1 + n2 + 1)/2) - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut1];

            if(l1 <= r2 && l2 <= r1){
                if((n1 + n2) % 2 == 0){
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                } else{
                    return Math.max(l1, l2);
                }      
            } else if(l1 > r2){
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
    public static void main(String args[]){
        int nums1[] = {2,4,6};
        int nums2[] = {1,3,5};
        Median median = new Median();
        System.out.println(median.findMedian(nums1, nums2));
    }
    
}
