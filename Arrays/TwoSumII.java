/*Leetcode number 167, Two sum II ,Time Complexity: O(n),Space Complexity: O(1)
Approach: Two Pointers
Since the array is sorted, place one pointer at the beginning and another at the end.
Calculate the sum of the two pointed elements.
If the sum equals the target, return their 1-based indices.
If the sum is smaller than the target, move the left pointer to the right to increase the sum.
If the sum is greater than the target, move the right pointer to the left to decrease the sum.
Continue until the target sum is found.
Key Idea
he sorted order allows us to eliminate impossible pairs without checking every combination.
Moving the left pointer increases the sum, while moving the right pointer decreases the sum, leading to a linear-time solution. */

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int right=numbers.length-1;
        int left= 0;
        while(left<right){
            int sum= numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }
            else if(sum<target)
            left++;
            else
            right--;
        }
        return new int[]{};
    }
}

