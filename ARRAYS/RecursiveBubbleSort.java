package ARRAYS;

public class RecursiveBubbleSort {
    static void bubbleSort(int[] arr, int n) {
        // Base case: If array size is 1 or less, it's already sorted
        if (n == 1) {
            return;
        }

        // Flag to check if any swaps occurred in this pass
        int swapCount = 0; 
        
        // One pass of bubble sort: Largest element bubbles to the end
        for (int j = 0; j < n - 1; j++) { // Loop up to n-1, as we compare j and j+1
            if (arr[j] > arr[j + 1]) {
                // Swap elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapCount = 1; // Mark that a swap occurred
            }
        }

        // Optimization: If no two elements were swapped in this pass,
        // then the array is sorted, so we can stop.
        if (swapCount == 0) {
            return;
        }

        // Recursive call for the remaining unsorted part
        // The largest element is now at arr[n-1], so we sort the first n-1 elements
        bubbleSort(arr, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr, n);

        System.out.println("After sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}