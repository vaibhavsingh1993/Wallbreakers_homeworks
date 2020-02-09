/**
 * 832. Flipping an Image https://leetcode.com/problems/flipping-an-image/
 * Leetcode Easy
 * 
 * O(n * m) time complexity, O(n * m) space complexity
 */

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] newA = new int[A.length][A[0].length];

        for (int row = 0; row < A.length; row++) {
            flip(A, newA, row);
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (newA[i][j] == 0) {
                    newA[i][j] = 1;
                } else {
                    newA[i][j] = 0;
                }
            }
        }
        return newA;
    }

    private void flip(int[][] A, int[][] newA, int row) {
        for (int i = 0; i < A[0].length; i++) {
            newA[row][A.length - 1 - i] = A[row][i];
        }
    }

}