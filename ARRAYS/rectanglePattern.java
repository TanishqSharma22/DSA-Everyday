package ARRAYS;

import java.util.Scanner;

public class rectanglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of length and breadth");
        Scanner sc = new Scanner(System.in);
        System.out.print("LENGTH :");
        int length = sc.nextInt();
        System.out.print("BREADTH :");
        int breadth = sc.nextInt();

        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= breadth; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
