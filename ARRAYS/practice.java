package ARRAYS;
import java.util.*;

public class practice{

    public void printNumber(int number, int startsFrom){
        if(startsFrom < 1){
            return;
        }
        System.out.println(startsFrom);
        printNumber(number, startsFrom-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int startsFrom = number;

        practice p = new practice();
        p.printNumber(number, startsFrom);

        sc.close();
    }
}