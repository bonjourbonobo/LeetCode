class Solution {
    public int minDeletionSize(String[] A) {
        int result = 0;
        
        for(int i=0; i<A[0].length(); i++){
            int pre = A[0].charAt(i)-0;
            int next = 0;
            int diff=0;
            for(int j=1; j<A.length; j++){
                next = A[j].charAt(i)-0;
                diff = next - pre;
                if(diff < 0){
                    result ++;
                    break;
                }
                pre = next;
            }
        }
        
        return result;
        
    }
}
