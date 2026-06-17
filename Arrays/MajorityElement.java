/*leetcode probno.169 Majority element

*/












//aproach: brute force
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
