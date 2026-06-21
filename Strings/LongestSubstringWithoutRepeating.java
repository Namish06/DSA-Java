/*leetcode no.3  longest substring without repeating
Approach:Array Lookup  Time: O(n) Space: O(1)  Faster!
Use an integer array pos to store the latest position of each character.
The array index corresponds to the ASCII value of the character.
Maintain a sliding window using two pointers: left and right.
For each character, check its last stored position in pos.
Move left to the maximum of its current value and the stored position to avoid duplicates in the window.
Calculate the current window length using right - left + 1 and update the maximum length.
Store the current character's latest position as right + 1.
Continue until the entire string is processed.  
The array acts like a HashMap where:
Index = ASCII value of character
Value = latest position of that character
Direct array lookup is faster than HashMap lookup while using the same sliding window concept.*/
public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max = 0;
        int pos[]= new int[128];
        for(int right=0; right <s.length(); right++){
        char ch= s.charAt(right);
        left= Math.max(left,pos[ch]);
        max= Math.max(max, right-left+1);
        pos[ch]= right+1;
    }
    return max;
}}




/*Approach2: Hashmap+ sliding window, Time:O(n), space:O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max = 0;
        HashMap <Character,Integer> map= new HashMap<>();
        for(int right=0; right <s.length(); right++){
        char ch= s.charAt(right);
        if(map.containsKey(ch))
          left= Math.max(left,map.get(ch)+1);
        
        map.put(s.charAt(right),right);
        max= Math.max(max, right-left+1);
    }
    return max;
}}
If the current character already exists in the HashMap, it means a duplicate is found.
Move the left pointer to one position after the previous occurrence of that character.
Use Math.max() to ensure the left pointer never moves backward.
Update the current character's latest index in the HashMap.
Calculate the current window length using right - left + 1.
Update the maximum length if the current window is larger.
Continue until the entire string is processed.
Key Idea
The HashMap stores character → latest index.
The window [left, right] always contains unique characters.
Whenever a duplicate is found, shrink the window by moving left instead of restarting the search. */
