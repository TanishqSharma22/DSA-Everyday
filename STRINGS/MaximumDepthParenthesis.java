package STRINGS;
class MaximumDepthParenthesis {
    public int maxDepth(String s){
        int max = 0, current = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                current++;
                if(current > max) max = current;
            }else if(ch == ')'){
                current--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        MaximumDepthParenthesis md = new MaximumDepthParenthesis();
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(md.maxDepth(s));
    }
}