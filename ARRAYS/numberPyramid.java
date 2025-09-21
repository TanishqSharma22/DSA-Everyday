package ARRAYS;


public class numberPyramid {
    public static void main(String args[]){
        int n = 10;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        int m = 10;
        for(int i = 1; i <=m; i++){
            for(int j = 1; j<=m-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

        System.out.println();
        int o = 5;
        int number = 1;
        for(int i = 1; i <=o; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        // 0-1 Triangle
        int p = 5;
        for(int i = 1; i<=p; i++){
            for(int j =1; j<=i; j++ ){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    
}
