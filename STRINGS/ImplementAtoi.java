package STRINGS;

public class ImplementAtoi {
    public boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }
    public int myAtoi(String s){
        int i = 0;
        int sign = 1;
        int num = 0;
        int n = s.length();
        // ignore leading spaces
        while(i < n && s.charAt(i) == ' '){
            i += 1;
        } 
        if(i < n){
            // check for sign
            if(s.charAt(i) == '-'){
                sign = -1;
                i = i+1;
            }
            else if(s.charAt(i) == '+'){
                i = i +1;
            }
        }
        while(i < n && isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(num == Integer.MAX_VALUE / 10){
                if(sign == 1){
                    if(digit >= 7){
                        return Integer.MAX_VALUE;
                    }
                }
            }
            if(num > Integer.MAX_VALUE / 10){
                if(sign == -1){
                    return Integer.MAX_VALUE;
                } else{
                    return Integer.MIN_VALUE;
                }

            }
            num =num * 10 + digit;
            i = i +1;
      }
      return num * sign;
    }
    public static void main(String[] args) {
        ImplementAtoi obj = new ImplementAtoi();
        String s = "   -42";
        System.out.println(obj.myAtoi(s));
    }
    
}
