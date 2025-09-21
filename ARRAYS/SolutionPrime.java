package ARRAYS;
import java.util.*;
public class SolutionPrime {
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        SolutionPrime sol = new SolutionPrime();
        boolean isPrimeNumber = sol.isPrime(n);
        if(isPrimeNumber){
            System.out.println(n + " is a prime numner.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
    
}
