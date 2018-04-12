/*
Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.

Example 1:
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies. 

Example 2:
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
The sister has two different kinds of candies, the brother has only one kind of candies. 

Note:
The length of the given array is in range [2, 10,000], and will be even.
The number in given array is in range [-100,000, 100,000].
*/

// Solution 1: too slow
class Solution {
    public int distributeCandies(int[] candies) {
        
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : candies){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        
        int[] countOfNums = new int[candies.length+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            countOfNums[entry.getValue()]++;
        }
        
        for(int i : countOfNums){
            System.out.println(i);
            if(result+i>=candies.length/2){
                System.out.println("result+i>=candies.length");
                return candies.length/2;
            }
            result+=i;
        }
        return result;
    }
}

// Solution 2: count how many different cnadies there are
class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : candies){
            set.add(i);
        }
        if(set.size() >= candies.length/2){
            return candies.length/2;
        }
        else{
            return set.size();
        }
    }
}
