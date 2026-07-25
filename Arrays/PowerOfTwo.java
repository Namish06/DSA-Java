/*leetcode no. 231, Power of Two, Time Complexity: O(1),Space Complexity: O(1)
Approach1: Bit Manipulation (optimal)
A power of two has exactly one set bit (1) in its binary representation.
Subtracting 1 from a power of two flips the only set bit to 0 and changes all lower bits to 1.
Performing n & (n - 1) removes the lowest set bit.
If the result is 0, the number had only one set bit, so it is a power of two.
Check n > 0 first because 0 and negative numbers are not powers of two.*/
class PowerOfTwo
{
    public boolean isPowerOfTwo(int n) {
       return n>0 && (n & (n-1))==0;
    }
}
/* Approach2: Division by 2, Time: O(log n), Space: O(1)
If n is less than or equal to 0, it cannot be a power of two.
Repeatedly divide the number by 2 while it is divisible by 2.
If the final value becomes 1, the number is a power of two; otherwise, it is not. */
class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n<=0)
      return false;
      while(n%2==0)
      {
        n=n/2;
    }
    return n==1;
    }
}
