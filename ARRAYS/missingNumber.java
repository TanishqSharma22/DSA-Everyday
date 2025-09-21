 package ARRAYS;
 public class missingNumber{

    public static int numbers(int a[], int n){
        int sum = (n * (n+1) / 2);

        int s2 = 0;
        for(int i = 0; i < n-1; i++){
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
    public static void main(String args[]){

        int n = 5;
        int a[] = {1, 2, 4, 5};

        int ans = numbers(a, n);
        System.out.print(ans);
        
    }

 }