package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int n = arr.length;;
        int m = arr[0].length;
        int top = 0;
        int left = 0;
        int right = m-1;
        int bottom = n-1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++)
                result.add(arr[top][i]);
                top++;
            
            for(int i = top; i <= bottom; i++)
                result.add(arr[i][right]);
                right--;
            
            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    result.add(arr[bottom][i]);
                    bottom--;  
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--)
                result.add(arr[i][left]);
                left++;

            }
        }
        return result;

    }
    public static void main(String args[]){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> result = spiralOrder(arr);


        for(int i = 0;i<result.size();i++){
            System.out.print(result.get(i) + " ");
        }

        System.out.println();
    }
}
    
