/*leetcode no.485 max consecutive ones
Approach1:Counter,OPTIMAL, Time Complexity: O(n), Space Complexity: O(1)
Traverse the array while maintaining a count of consecutive 1s.
If the current element is 1, increment the count and update the maximum count.
If the current element is 0, reset the count to 0 because the consecutive sequence ends.
Continue until the end of the array.
Return the maximum consecutive count found.*/
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max_cnt=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
            count++;
            max_cnt= Math.max(max_cnt, count);
            }
            else
            count=0;
        }
        return max_cnt;
    }
}
