package ARRAYS;

import java.util.Scanner;

public class FactorialRecursive {
    public int Factorial(int n){
        if (n <= 0){
            return 1;
        }
        return n * Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        FactorialRecursive f = new FactorialRecursive();
        int product = f.Factorial(n);
        System.out.print("Factorial of "+ n + " is "+ product);
        
        sc.close();
        
    }
    
}
