/*
A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

Note:
S will have length in range [1, 500].
S will consist of lowercase letters ('a' to 'z') only.
*/

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<Integer>();
        String s = String.valueOf(S.charAt(0));
        int first = 0;
        int last = S.lastIndexOf(s);
        String subS = S.substring(first, last);
        
        while(true){
            for(int i=first; i<last; i++){
                s = String.valueOf(S.charAt(i));
                int lastS = S.lastIndexOf(s);
                if(lastS > last){
                    last = lastS;
                }
            }
            result.add(last-first+1);
            first = last+1;
            if(first >= S.length()) break;
            s = String.valueOf(S.charAt(first));
            last = S.lastIndexOf(s);
        }
        return result;
    }
}
