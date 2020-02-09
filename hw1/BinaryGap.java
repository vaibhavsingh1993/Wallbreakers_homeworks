class Solution {
    public int binaryGap(int N) {
        List<Integer> list = new ArrayList();
        char[] c = Integer.toBinaryString(N).toCharArray();
        int max = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1')
                list.add(i);
        }
        for (int i = list.size() - 1; i > 0; i--) {
            max = Math.max(max, list.get(i) - list.get(i - 1));
        }
        return max;
    }
}