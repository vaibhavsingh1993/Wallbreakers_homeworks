/**
 * 461. Hamming Distance
 * 
 * https://leetcode.com/problems/hamming-distance/
 * 
 * O(n) time O(c) space
 */

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}