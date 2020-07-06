/* Question :- The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.   */
// Solution in Java

class Solution {
    public int hammingDistance(int x, int y) {
     int count =0;
     String newX=String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0");
     String newY = String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0");
  
     for (int i=0;i<newX.length();i++)
         {
            if(newX.charAt(i) != newY.charAt(i))
            {
                count++;
              
            }
         }
   
   return count;
 }
}
