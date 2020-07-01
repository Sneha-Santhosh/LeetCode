/* Question :- Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
// Solution in Java

class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int l,temp;
        l=nums.length;
    while(k>0)
    {
        temp = nums[l-1];
        for(int i=l-1;i>0;i--)
        {
            nums[i]=nums[i-1];
         
        }
        nums[0]=temp;
        k--;
    }
    }
}
