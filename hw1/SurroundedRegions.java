/**
 * 130. Surrounded Regions
 * 
 * https://leetcode.com/problems/surrounded-regions/
 * 
 * O(n*m*4) time complexity, O(n*m) space complexity
 */
class Point {
    int row;
    int col;

    Point(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public void solve(char[][] board) {
        if (board.length == 0)
            return;
        int row = board.length, col = board[0].length;

        Queue<Point> queue = new LinkedList();
        // Add all 0's on edge to the queue.
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') {
                queue.add(new Point(i, 0));
            }
            if (board[i][col - 1] == 'O') {
                queue.add(new Point(i, col - 1));
            }
        }

        for (int i = 0; i < col; i++) {
            if (board[0][i] == 'O') {
                queue.add(new Point(0, i));
            }
            if (board[row - 1][i] == 'O') {
                queue.add(new Point(row - 1, i));
            }
        }

        // Run BFS for all O's neighbors in queue, mark them as *.

        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int r = p.row, c = p.col;
            for (int dir = 0; dir < directions.length; dir++) {
                r = r + directions[dir][0];
                c = c + directions[dir][1];

                if (r >= 0 && r < row && c >= 0 && c < col) {
                    if (board[r][c] == 'O') {
                        board[r][c] = '*';
                        queue.add(new Point(r, c));
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                if (board[i][j] == '*')
                    board[i][j] = 'O';
            }
        }

    }
}