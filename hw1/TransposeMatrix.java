/**
 * 867. Transpose Matrix https://leetcode.com/problems/transpose-matrix/
 * Leetcode easy
 * 
 * O(n * m) time complexity, O(n*m) space complexity
 */

class Solution {
    public int[][] transpose(int[][] A) {
        int[][] newA = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                newA[j][i] = A[i][j];
            }
        }
        return newA;
    }
}