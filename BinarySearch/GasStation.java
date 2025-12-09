/*Input: n = 10, arr = [1, 2, 3, 4, 5, 6 ,7, 8, 9, 10], k = 9
Output: 0.50000
Explanation:
One of the possible ways to place 10 gas stations is [1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10].
Thus the maximum difference between adjacent gas stations is 0.5.
Hence, the value of dist is 0.5.
It can be shown that there is no possible way to add 10 gas stations in such a way that the value of dist is lower than this. */

public class GasStation {
    public int noOfGasStations(int[] arr, double dist) {
        int n = arr.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            int noInBetween = (int)((arr[i] - arr[i-1])/ dist);
            if((arr[i] - arr[i-1]) == (dist * noInBetween)){
                noInBetween--;
            }
            count += noInBetween;
        }
        return count;
    }
    public double minMaxDistance(int[] arr, int k){
        int n = arr.length;
        double low = 0, high = 0;

        for(int i = 1; i < n-1; i++){
            high = Math.max((arr[i + 1] - arr[i]),high);
        }
        double diff = 1e-6;

        while(high - low > diff){
            double mid = (low + high) / 2.0;
            int count = noOfGasStations(arr, mid);
            if(count > k){
                low = mid;
            } else{
                high = mid;
            }
        }
        return high;

    }
    public static void main(String args[]) {
        int k = 9;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        GasStation gs = new GasStation();
        System.out.println(gs.minMaxDistance(arr, k));
    }
    
}