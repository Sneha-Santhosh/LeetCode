/* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:

Input: "race a car"
Output: false
*/

class Solution {
    public boolean isPalindrome(String s) {
      String r="";
     s = s.replaceAll("\\p{Punct}"," "); 
       s= s.replaceAll("\\s","");
        s=s.toLowerCase();
        
      int length = s.length();
        for(int i=length-1;i>=0;i--)
        {
            r = r + s.charAt(i);
        }
        if(r.equals(s))
        {
            return true;
        }
        else 
            return false;
        
    }
}
