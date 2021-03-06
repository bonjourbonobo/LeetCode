/*
Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:
Input:
"tree"
Output:
"eert"
Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input:
"cccaaa"
Output:
"cccaaa"
Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:
Input:
"Aabb"
Output:
"bbAa"
Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
*/

class Solution {
    public String frequencySort(String s) {
        //統計每個字元的個數
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }   
            else{
                map.put(s.charAt(i), 1);
            }
        }
        
        //依序看個數多寡，加到字串上
        StringBuffer sb = new StringBuffer();
        int max = 0;
        char c = ' ';
        for(int i=0; i<map.size(); i++){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    c = entry.getKey();
                }
            }
            for(int j=0; j<max; j++){
                sb.append(c);
            }
            map.put(c, 0);
            max = 0;
        }
        return sb.toString();
    }
}
