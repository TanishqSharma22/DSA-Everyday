package ARRAYS;

import java.util.*;
public class IsSorted {
    public boolean isSorted(ArrayList<Integer> nums){
        if(nums == null || nums.size() <= 1){
            return true;
        }
        for(int i = 0; i < nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n =sc.nextInt();

        ArrayList<Integer> numsList = new ArrayList<>();
        System.out.println("Enter " + n + "Integer.");
        for(int i = 0; i < n; i++){
            numsList.add(sc.nextInt());
        }
        IsSorted obj = new IsSorted();
        System.out.println(obj.isSorted(numsList));
        sc.close();

    }
    
}
