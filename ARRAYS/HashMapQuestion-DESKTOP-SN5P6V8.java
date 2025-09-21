package DSA;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuestion {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Precompute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        System.out.println("Enter the queries: ");
        int q = sc.nextInt();
        while(q-- > 0){
            
            int number = sc.nextInt();
            if(mp.containsKey(number))System.out.println(mp.get(number));
            else{
                System.out.println(0);
            }
        }
        sc.close();

    }
    
}
