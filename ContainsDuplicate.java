/* Question :- Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true           */

class Solution {
    
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
      for(int i=0;i<nums.length;i++)
      {
           if(set.contains(nums[i]))
              {
                 return true;
              }
              
          set.add(nums[i]);
      }
       
    return false;   
    }
}
