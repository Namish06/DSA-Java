/*Leetcode no. 268, Missing number
Approach1: XOR-- Time: O(n) space: O(1) 
Initialize xor with n because indices only go from 0 to n-1.Traverse the array.
XOR the current index and the current array element with xor.
Since every number except the missing one appears exactly twice in the combined XOR operation, all duplicate values cancel each other.
The remaining value is the missing number.*/
public class MissingNumber {
       public int missingNumber(int[] nums) {
        int xor=nums.length;
        for(int i=0; i<nums.length; i++){
            xor=xor^i;
            xor=xor^nums[i];
        }
        return xor;
    }}

/*Approach2: Mathematical Formula, Time Complexity: O(n) Space Complexity: O(1)
Calculate the expected sum of numbers from 0 to n using the formula n × (n + 1) / 2.
Calculate the actual sum of all elements in the array.
The difference between the expected sum and the actual sum is the missing number.*/
class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum= n*(n+1)/2;
        int arrSum=0;
        for(int i: nums)
        arrSum= arrSum+i;
        return sum-arrSum;
    }}
