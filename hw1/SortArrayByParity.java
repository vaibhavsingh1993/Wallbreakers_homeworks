/**
 * https://leetcode.com/problems/sort-array-by-parity - LC Easy
 * O(n) time complexity, O(n) space complexity
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int first = 0, last = A.length - 1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                ans[first] = A[i];
                first++;
            } else {
                ans[last] = A[i];
                last--;
            }
        }
        
        return ans;
    }
}