package ARRAYS;



public class halfPyramid {
    public static void main(String[] args) {
        int n = 14;
       for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
       }


       int m = 14;
       for(int i = 1; i<=m; i++){
        for(int j = 1; j<=m-i; j++){
            System.out.print("   ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println(" ");
       }
    }
    
}
