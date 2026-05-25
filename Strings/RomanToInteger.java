//leetcode question 13, roman to integer
// approach: Hashmap
//Time Complexity: O(n), Space Complexity: O(1)
import java.util.HashMap;
public class RomanToInteger {
    

    public int romanToInt(String s) {
        HashMap<Character, Integer> ht = new HashMap<>();
        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);
        int ans=0;
        for(int i=0; i<s.length(); i++)
        {
            
            int curr= ht.get(s.charAt(i));
            if(i + 1 < s.length() && curr < ht.get(s.charAt(i+1)))
             ans= ans-curr;
             else
             ans= ans+curr;

        }
        return ans;

    }
}

/*approach :

We store Roman numeral values in a HashMap. Then traverse the string from left to right.

For each character:

If the current Roman value is smaller than the next value, subtract it (cases like IV, IX, XL, CM).
Otherwise, add it.

This works because Roman numerals follow the rule:

smaller before bigger → subtract
otherwise → add */
