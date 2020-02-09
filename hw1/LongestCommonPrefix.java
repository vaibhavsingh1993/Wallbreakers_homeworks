/**
 * Longest Common Prefix
 * 
 * https://leetcode.com/problems/longest-common-prefix/
 * 
 * O(n * len(str)) time complexity, O(c) space complexity
 * 
 * Check the first string for existance in other strings, if not remove the last
 * character and check, and so on.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String checker = strs[0];
        int curr = 1;
        while (curr < strs.length) {
            while (strs[curr].indexOf(checker) != 0) {
                checker = checker.substring(0, checker.length() - 1);
            }
            curr++;
        }
        return checker;
    }
}