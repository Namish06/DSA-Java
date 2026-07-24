/*leetcode no.643  Maximum average subarray I 
Approach: Sliding Window, Time Complexity: O(n) Space Complexity: O(1)
Since k is fixed, the subarray with the maximum average will also have the maximum sum.
Calculate the sum of the first window of size k.
Store this sum as the current maximum sum.
Slide the window one position at a time:
Remove the element leaving the window.
Add the new element entering the window.
Update the maximum sum whenever a larger window sum is found.
Return max / k as the maximum average. */
public class MaxAverageSubarrayI {
     
    public double findMaxAverage(int[] nums, int k) {
    int sum=0;
    for(int i=0; i<k; i++)
    {
    }
    int max= sum;
    for(int i=k; i<nums.length; i++){
        sum= sum - nums[i-k]+ nums[i];
        max= Math.max(max,sum);

    }
    return (double)max/k;
        }}

