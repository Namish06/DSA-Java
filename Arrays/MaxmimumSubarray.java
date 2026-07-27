/*Leetcode no. 53 Maximum subarray
Approach: Kadane's Algorithm(optimal), Time Complexity: O(n), Space Complexity: O(1)
Traverse the array while maintaining the sum of the current subarray.
Add the current element to the running sum.
Update the maximum subarray sum if the current sum is greater than the maximum found so far.
If the running sum becomes negative, reset it to 0 because a negative sum cannot increase the sum of any future subarray.
Continue until the end of the array and return the maximum sum.
Key Idea
A negative running sum always decreases the sum of any future subarray, so it is better to discard it and start a new subarray from the next element.
At every step, keep track of both the current subarray sum and the maximum subarray sum found so far. */
public class MaxmimumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=nums[0];
        for(int num: nums){
            currentSum+=num;
            maxSum= Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}

