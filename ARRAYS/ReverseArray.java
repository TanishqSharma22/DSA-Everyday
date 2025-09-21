package ARRAYS;



class ReverseArray{
    public void printArray(int[] ans, int n){
        System.out.print("Reversed array :-\n");
        for(int i = 0; i<n; i++){
            System.out.println(ans[i] + " ");
        }
    }
    public void reverse(int[] arr, int n){
        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--){
             ans[n-i-1] = arr[i];
        }
        printArray(ans, n);
    }
    public static void main(String[] args) {
        int n=5;
        int[] arr = {1, 2, 3, 4, 5};

        ReverseArray obj = new ReverseArray();
        obj.reverse(arr, n); 
    }
}