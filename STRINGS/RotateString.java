package STRINGS;

public class RotateString {
    public boolean rotate(String s, String goal){
        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);
    }
    public static void main(String args[]){
        RotateString rs = new RotateString();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rs.rotate(s, goal));
    }

    
}
