/*leetcode probno.169 Majority element, Time:O(n), Space:O(1)
Approach: Boyer-Moore Voting Algorithm
Key Idea: Think of each occurrence of the majority element as a vote.
Every different element cancels one vote of the current candidate.
Because the majority element occurs more than half the time, it will always have votes remaining after all cancellations, making it the final candidate.
steps:
Initialize a candidate variable and a count variable.
Traverse the array once.
If count becomes 0, choose the current element as the new candidate.
If the current element matches the candidate, increment count; otherwise, decrement count.
Since the majority element appears more than n/2 times, it cannot be completely cancelled out by other elements during this voting process.
After the traversal, the remaining candidate is the majority element.
*/
class Solution {
    public int majorityElement(int[] nums) {
     int count=0;
     int candidate=0;
     for(int num: nums){
        if(count==0)
        candidate=num;
        if(num==candidate)
        count++;
        else
        count--;
     }   
     return candidate;
}}

//aproach: brute force O(n^2)
public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        int n= nums.length;
        
        for(int i=0; i<nums.length; i++)
        {
            int count=1;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                    count++;
                
            }
            if(count>n/2)
                return nums[i];
        }
        return -1;
    }
}
