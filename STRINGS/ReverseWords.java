package STRINGS;

public class ReverseWords {
    public static String reverse(String s){
        int left = 0;
        int right = s.length() - 1;
        String temp = "";
        String ans = "";

        while(left <= right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp += ch;
            } else if(ch == ' '){
                if(!ans.equals("")){
                    ans = temp + " " + ans;
                }else{
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp + " " + ans;
            }else{
                ans = temp;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String s =  "welcome to the jungle";
        System.out.println(reverse(s));
    }
    
}
