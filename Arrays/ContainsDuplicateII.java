/*leetcode no.219 contains duplicateII Time Complexity: O(n) , Space Complexity: O(min(n, k))

Approach 1: Sliding window + HashSet
Maintain a HashSet containing at most the last k elements.
Traverse the array.
If the current element is already present in the set, return true.
Add the current element to the set.
If the set size exceeds k, remove the element that is k positions behind.
If traversal completes without finding a duplicate, return false. */

import java.util.HashSet;
class ContainsDuplicateII{
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }}
        return false;
        }}

/* Approach2: Hashmap to store indexes and value   Time Complexity: O(n)  Space Complexity: O(n)
Create a HashMap to store each element and its latest index.
Traverse the array from left to right.
For each element:
Check if it already exists in the map.
If it exists, calculate the distance between the current index and the previous index.
If the distance is less than or equal to k, return true.
Update the element's index in the map with the current index.
If no valid pair is found after traversing the entire array, return false.

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i]) )
        {
            if (i - map.get(nums[i]) <= k) 
            return true;
        }
        map.put(nums[i], i);
        }
        return false;
}}
        */
