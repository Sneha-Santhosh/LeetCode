class Solution(object):
      def reverseString(self, s, lo=0, hi=None):
        if hi == None:
            hi = len(s) - 1

        if hi <= lo:
            return s

        s[lo], s[hi] = s[hi], s[lo]
        return self.reverseString(s, lo + 1, hi - 1)
