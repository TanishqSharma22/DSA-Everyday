package BinarySearch;

public class SqareRoot {
    public int sqrt(int n) {
        int low = 1, high = n;
        int ans = 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid*mid <= n){
                ans = mid;
                low = mid + 1;

            }
            else{
                high = mid - 1;
            }
        }
        return ans;
        }
    public static void main(String args[]){
        int n = 36;
        SqareRoot obj = new SqareRoot();
        System.out.println(obj.sqrt(n));
    }
    
}
