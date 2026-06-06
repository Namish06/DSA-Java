/*leetcode question27, remove elemet
Complexity-- Time: O(n) Space: O(1)
left stores position where next valid element should go.
Traverse array: if element ≠ val
copy it to nums[left]
increment left
At end:
left = number of remaining elements */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
       int left=0;
      
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[left] = nums[i];
                left++;

            }
        }
        return left;
    }
    
}
