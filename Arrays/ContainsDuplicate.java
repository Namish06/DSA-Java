/*leetcode problem no.217 Contains Duplicate
approach: Hashset(optimal) time & space: O(n) 
We scan the array once For each number:
Step 1:
Check:is number already in set?
Step 2:
Yes → duplicate exists → stop
No → store it*/

import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
       
        HashSet <Integer> set= new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);

        }
        return false;
    }}

/* Alternative  Optimal approach: Sorting
import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
            return false;
    }
}
Complexity:
Time: O(n log n)
Space: O(1)

*/