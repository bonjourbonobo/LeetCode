/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

// Solution 1
class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        for(String s: words){
           
            char[] charArray = s.toCharArray();
            int lastRow = 0;
            int thisRow = 0;
            boolean addResult = true;
            for(char c: charArray){
                
                if(row1.indexOf(c)>=0) thisRow=1;
                else if(row2.indexOf(c)>=0) thisRow=2;
                else if(row3.indexOf(c)>=0) thisRow=3;
                if(lastRow!=0 && lastRow!=thisRow){
                    addResult = false;
                    break;
                } 
                lastRow = thisRow;
                  
            }
            if(addResult==true) result.add(s);
            else addResult=true;
            
        }
        
        return  result.toArray(new String[0]);
    }
}

// Solution 2: faster 
class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        for(String word : words){
            int rowNum = 0;
            boolean sameRow = true;
            for(char c : word.toCharArray()){
                if(row1.indexOf(c) != -1){
                    if(rowNum == 0){
                        rowNum = 1;
                    }
                    else{
                        if(rowNum != 1){
                            sameRow = false;
                            break;
                        }
                    }
                    
                }
                else if(row2.indexOf(c) != -1){
                    if(rowNum == 0){
                        rowNum = 2;
                    }
                    else{
                        if(rowNum != 2){
                            sameRow = false;
                            break;
                        }
                    }
                } 
                else if(row3.indexOf(c) != -1){
                    if(rowNum == 0){
                        rowNum = 3;
                    }
                    else{
                        if(rowNum != 3){
                            sameRow = false;
                            break;
                        }
                    }
                }
            }
            if(sameRow){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
