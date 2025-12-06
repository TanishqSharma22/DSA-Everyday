import java.util.Arrays;

public class SmallestDivisorFinder{

    public int sumByD(int[] arr, int div){
        int sum = 0;
        for(int n : arr){
            sum += Math.ceil((double)n/div);
        }
        return sum;
    }
    public int SmallestDivisorFinder(int[] arr, int limit){
        if(arr.length > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        while(low < high){
            int mid = (low + high) / 2;
            if(sumByD(arr, mid) <= limit){
                high = mid;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static void main(String[] args){
        int [] arr = {8,4,2,3};
        int limit = 10;
        SmallestDivisorFinder obj = new SmallestDivisorFinder();
        System.out.println(obj.SmallestDivisorFinder(arr, limit));

}}
    

