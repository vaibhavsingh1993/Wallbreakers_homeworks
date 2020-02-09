class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0; // For example, 16 is 1000, 15 is 0111, bitwise AND of both numbers gives
                                            // 0000.
    }
}