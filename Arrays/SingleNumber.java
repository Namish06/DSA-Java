/*leetcode no.166 Single number, optimal approach 
Time	O(n)  Space	O(1) 
Approach: bitwise manipulation using XOR
Initialize a variable ans as 0.
Traverse the array and perform XOR (^) of each element with ans.
Since a ^ a = 0, all duplicate elements cancel each other out.
Also, a ^ 0 = a, so the element that appears only once remains in ans.
Return ans as the single number.
 XOR of two equal numbers is 0, so all duplicate elements cancel each other, leaving only the unique element.*/
public class SingleNumber {
     public int singleNumber(int[] nums) {
        int val=0;
        for(int num: nums){
            val= val^num;
        }
        return val;
    }
}
