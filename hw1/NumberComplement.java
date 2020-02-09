// a + complement(a) is 11111..., so subtract given number from 11111...
class Solution {
    public int findComplement(int num) {
        int i = 0;
        int j = 0;

        while (i < num) {
            i += Math.pow(2, j);
            j++;
        }
        return i - num;
    }
}