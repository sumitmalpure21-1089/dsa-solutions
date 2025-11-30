package com.kavyuri.dsa.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingSubstringWithNonRepeatingChars3 {
  // 2 pointer
  // o(n) & o(1) space complexity since hashset at max will contain 256 characters
  public int lengthOfLongestSubstring(String s) {
    int max = 0;
    int left = 0;
    Set<Character> charSet = new HashSet<>();
    for (int right = 0; right < s.length(); right++) {
      while (charSet.contains(s.charAt(right))) {
        charSet.remove(s.charAt(left));
        left++;
      }

      charSet.add(s.charAt(right));

      max = Math.max(max, (right - left + 1));
    }
    return max;
  }
}