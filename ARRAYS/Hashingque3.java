package ARRAYS;
import java.util.*;
public class Hashingque3 {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the elements of an array; ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int freq = 0;
            if(map.containsKey(key))
            freq = map.get(key);
            freq++;
            map.put(key, freq);

        }
        System.out.println("Enter the queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            if(map.containsKey(number)){
                System.out.println(map.get(number));
            }else{
                System.out.println(0);
            }
            
        }
        sc.close();
    }
    
}
