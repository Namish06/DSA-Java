//leetcode 26. Remove duplicates from sorted array
//Time Complexity: O(n) Space Complexity: O(1)

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
            nums[j]=nums[i];
            j++;
            }
        
    }
    return j;
    }
}
/*We use a two-pointer approach on a sorted array.

i traverses the array
j keeps track of the position of the next unique element

Since the array is sorted, duplicates are adjacent.

Steps:
Start j = 1
Traverse array from index 1 to n-1
If nums[i] != nums[i-1], it means a new unique element is found
Place it at nums[j]
Increment j
Return j as the number of unique elements */