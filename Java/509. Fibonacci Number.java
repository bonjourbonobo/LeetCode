class Solution {
    public int fib(int N) {
        /*
        // recursive
        if(N==0) return 0;
        if(N==1) return 1;
        return fib(N-1) + fib(N-2);
        */
        
        if(N==0) return 0;
        if(N==1) return 1;
        int result = 0;
        int f0 = 0;
        int f1 = 1;
        for(int i=1; i<N; i++){
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
        
    }
}
