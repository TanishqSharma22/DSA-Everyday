// counting how many similiar number are there in the array.
package ARRAYS;
import java.util.*;
class HashingQuestions{
    public static void main(String[] args) {
        System.out.println("Enter the  size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the elements in an array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }
        
        //precomputing 
        int q = sc.nextInt();
        System.out.println("Enter the number of queries: ");
        while(q-- != 0){
            int number = sc.nextInt();
            System.out.println(number + " : "+ hash[number]);
        }
        sc.close();
    }
}