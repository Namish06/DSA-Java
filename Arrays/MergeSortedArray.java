/*leetcode no.88 merge sorted arrays, Time Complexity for both: O(m+n), beats 100% 0ms
Approach 1: by creating an extra array, space:O(m+n)
Create a temporary array arr of size m + n to store the merged elements.
Use three pointers:
i for valid elements of nums1
j for elements of nums2
k for positions in arr
Compare nums1[i] and nums2[j].
Insert the smaller element into arr[k] and move the corresponding pointer forward.
Repeat until one of the arrays is completely traversed.
Copy the remaining elements of the unfinished array into arr.
Copy all elements from arr back to nums1.
*/
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int[] arr = new int[m+n];
          int i=0, j=0, k=0;
          while(i<m && j<n)
          {
            if(nums1[i]<=nums2[j] ){
            arr[k++]=nums1[i];
            i++;
            }
           else{
            arr[k++]=nums2[j];
              j++;
              }
        }
         while (i < m) {
            arr[k++] = nums1[i++];
        }

        while (j < n) {
            arr[k++] = nums2[j++];
        }
for(int x = 0; x < m+n; x++) {
    nums1[x] = arr[x];
} }
}
/*Approach2: optimal approach is to merge from the end, space:O(1)
Since nums1 already has enough extra space to hold all elements, no additional array is required.
Initialize three pointers:
i = m - 1 → last valid element in nums1
j = n - 1 → last element in nums2
k = m + n - 1 → last position in nums1
Compare nums1[i] and nums2[j].
Place the larger element at nums1[k] and move the corresponding pointer backward.
Continue until either array is fully traversed.
If elements remain in nums2, copy them into the remaining positions of nums1.*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;      
        int j = n - 1;      
        int k = m + n - 1;  

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}