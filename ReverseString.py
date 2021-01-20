""" Q: Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]  """


class Solution(object):
      def reverseString(self, s, lo=0, hi=None):
        if hi == None:
            hi = len(s) - 1

        if hi <= lo:
            return s

        s[lo], s[hi] = s[hi], s[lo]
        return self.reverseString(s, lo + 1, hi - 1)
