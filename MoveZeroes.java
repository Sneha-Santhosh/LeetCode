/* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
*/


public class Solution {
    public void MoveZeroes(int[] nums) {
        int n=nums.Length;
        // Count of non-zero elements 
        int count = 0;  
          
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element  
        // at index â..countâ.. with this element 
        for (int i = 0; i < n; i++) 
        if (nums[i] != 0) 
          
        // here count is incremented 
        nums[count++] = nums[i];  
          
        // Now all non-zero elements have been shifted to 
        // front and â..countâ.. is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
        nums[count++] = 0; 
    }
}
