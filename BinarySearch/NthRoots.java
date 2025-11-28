public class NthRoots {

    public int findRoots(int N, int M){
        int low = 1; 
        int high = M;

        while(low <= high){
            int mid = (low + high)/2;
            long val = 1;

            for(int i = 1; i <= N; i++){
                val *= mid;
                if(val > M) break;
            }
                if(val == M) return mid;
                if(val < M) low = mid + 1;
                else high = mid -1; 
        }
        return -1;
    }
    public static void main(String args[]){
        int N = 3;
        int M = 27;
        NthRoots obj = new NthRoots();
        System.out.println(obj.findRoots(N, M));
    }
    
}
