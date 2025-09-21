package ARRAYS;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class MergeSort{
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temporary = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Storing element in the temperary Array in sorted manner.
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temporary.add(arr[left]);
                left++;
            }else{
                temporary.add(arr[right]);
                right++;
            }
        }
        // if elements on the left are remaining.
        if(left <= mid){
            temporary.add(arr[left]);
            left++;
        }

        //if elements on the right are remaining.
        if(right <= high){
            temporary.add(arr[right]);
            right++;
        }
        
        // transfering all elements form temerory to array.
        for(int i = low; i < high; i++){
            arr[i] = temporary.get(i - low);
        }
    } 

    public static void sortMerge(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = low +(high - low)/2;
        sortMerge(arr, low, mid);  // left array
        sortMerge(arr, mid + 1, high);  // right array
        merge(arr, low, mid, high);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();

        System.out.print("Array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting array: "+ Arrays.toString(arr));
        sortMerge(arr, 0, n-1);
        System.out.println("After sorting array: "+ Arrays.toString(arr));

        sc.close();
    }

}
    

