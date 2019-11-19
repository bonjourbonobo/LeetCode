class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[]result = new int[A.length];
        int indexEvent = 0;
        int indexOdd = 1;
        for(int i=0; i<A.length; i++){
            if(A[i]%2 == 0){
                result[indexEvent] = A[i];
                indexEvent +=2;
            }
            else{
                result[indexOdd] = A[i];
                indexOdd +=2;
            }
        }
        return result;
    }
}
