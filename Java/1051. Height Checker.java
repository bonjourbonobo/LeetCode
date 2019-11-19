class Solution {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] sortedArray = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            sortedArray[i] = heights[i];
        }
        Arrays.sort(sortedArray);
        for(int i=0; i<heights.length; i++){
            if(heights[i] != sortedArray[i]) result++;
        }
        return result;
        
    }
}
