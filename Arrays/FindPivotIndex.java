//leetcode qno.724 Find Pivot Index
/*optimal approach: Time Complexity: O(n) Space Complexity: O(1)
First calculate the total sum of all elements in the array.
Maintain a leftSum, initially 0.
For each index, calculate the right sum using:
rightSum = totalSum - leftSum - nums[i].
Subtract nums[i] because the pivot element belongs to neither the left nor right side.
If leftSum == rightSum, return the current index.
After checking, add nums[i] to leftSum for the next index.
If no pivot is found, return -1. */
class Solution {
    public int pivotIndex(int[] nums) {
    int leftsum=0;
    int totalsum=0;
   for(int i=0; i<nums.length; i++){
    totalsum= totalsum+nums[i];
    }
    for(int i=0; i<nums.length; i++){
        int rightsum= totalsum-leftsum-nums[i];
        if(rightsum==leftsum)
        return i;
        leftsum=leftsum+nums[i];
    }
    return -1;
    }}