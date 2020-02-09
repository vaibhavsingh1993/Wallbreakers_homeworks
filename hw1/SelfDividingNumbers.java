/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/
 * 
 * Leetcode Easy
 * 
 * O(n * logn) amortized time complexity (log n factor for iterating trhough
 * digits) O(n) space complexity
 */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList();
        if (right < left)
            return ans;

        for (int i = left; i <= right; i++) {
            if (checkSelfDividing(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public boolean checkSelfDividing(int num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0' || (num % (c - '0') > 0)) {
                return false;
            }
        }
        return true;
    }
}