// Union Find
class Solution {
    public int findCircleNum(int[][] M) {
        int count = 0;
        int[] curr = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            curr[i] = i;
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i][j] == 1) {
                    unionFind(curr, i, j);
                }
            }
        }
        for (int i = 0; i < M.length; i++) {
            if (i == curr[i])
                count++;
        }
        return count;
    }

    void unionFind(int[] curr, int v1, int v2) {
        while (curr[v1] != v1)
            v1 = curr[v1];
        while (curr[v2] != v2)
            v2 = curr[v2];
        if (curr[v1] != curr[v2]) {
            curr[v2] = v1;
        }
    }
}