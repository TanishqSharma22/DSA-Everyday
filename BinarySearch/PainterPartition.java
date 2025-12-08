/*Input: A = 2, B = 5, C = [1, 10]
Output: 50
Explanation:
Painter 1 paints board 0 (length = 1), time = 5
Painter 2 paints board 1 (length = 10), time = 50
Max time = 50
Return 50 % 10000003 = 50 */

import java.util.Arrays;
public class PainterPartition {
    public int countPainters(int[] C, int maxTime){
        int painter = 1;
        int countTime = 0;
        for(int num : C){
            if(num > maxTime) return Integer.MAX_VALUE;
            if(countTime + num <= maxTime){
                countTime += num;
            } else{
                painter++;
                countTime = num;
            }
        }
        return painter;
    }
    public int paint(int A, int B, int[] C){
        int low = Arrays.stream(C).max().getAsInt();
        int high = Arrays.stream(C).sum();
        int result = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int requiredPainters = countPainters(C, mid);
            if(requiredPainters <= A){
                result = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return (int)((long)result * B % 10000003);
    }
    public static void main(String args[]){
        PainterPartition pp = new PainterPartition();
        int A = 2;
        int B = 5;
        int[] C = {1, 10};
        System.out.println(pp.paint(A, B, C)); // Output: 50

    }
    
}
