package STRINGS;

public class removeOuterParentheses {
    public String solutuon(String s){
        StringBuilder result = new StringBuilder();
        int bal = 0; // keep track of open close parentheses

        for(char c : s.toCharArray()){
            if(c == '('){
                if(bal > 0){
                    result.append(c);
                }
                bal++;
            }
            else{
                bal--;
                if(bal > 0){
                    result.append(c);
                }
            }
        }
        return result.toString();

    }
    public static void main(String args[]){
        removeOuterParentheses obj = new removeOuterParentheses();
        String s = "(()())(())";
        System.out.println(obj.solutuon(s));
    }

    
}
