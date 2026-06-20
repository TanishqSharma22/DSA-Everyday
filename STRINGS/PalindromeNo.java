package STRINGS;

public class PalindromeNo {
    public boolean check(int n){
        int revNum = 0;
        int dup = n;
        while(n > 0){
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        return dup == revNum;

    }
    public static void main(String args[]){
        int n = 121;
        PalindromeNo obj = new PalindromeNo();
        if(obj.check(n)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
    
}
