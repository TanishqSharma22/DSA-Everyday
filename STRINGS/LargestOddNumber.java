package STRINGS;
class LargestOddNumber{    
    public String largeOddNum(String s) {
        int n = s.length();
        int end = -1;

        // find last odd digit
        for (int i = n - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                end = i;
                break;
            }
        }

        if (end == -1) return ""; // no odd digit found

        // skip leading zeros
        int start = 0;
        while (start <= end && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, end + 1);
    }

    public static void main(String args[]){
        String s = "0214638";
        LargestOddNumber sol = new LargestOddNumber();
        System.out.print(sol.largeOddNum(s));  // Output: 21463
    }
}
