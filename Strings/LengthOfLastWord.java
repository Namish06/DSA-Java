/*Leetcode no.58 Length of last word, beats 100%, 
Time Complexity: O(n)
Space Complexity: O(1)
approach:
Traverse the string from the end because the last word is located near the end.
First, skip all trailing spaces to reach the last character of the last word.
Count consecutive non-space characters until a space or the beginning of the string is reached.
Return the count as the length of the last word.  */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int i = s.length() - 1; i >= 0; i--){
           if(s.charAt(i)==' ' && count==0)
           continue;
           if(s.charAt(i)== ' ')
           return count;
           count++;
        }
        return count;
        
    }
}
/*The continue keyword in Java skips the remaining code inside the current loop iteration and immediately moves the program control to the next iteration.
 Unlike the break keyword which exits a loop entirely, continue keeps the loop running. */