package ARRAYS;
//  selection sort
                // eg :- 13 46 24 52 20 9

                
import java.util.*;
public class SelectionSort{
    static void selection(int n, int arr[]){
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // SWAPING
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("After selection sort: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int arr[] = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        selection(n, arr);
        sc.close();
    }
}