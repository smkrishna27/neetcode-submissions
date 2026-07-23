class Solution {
    public void islandsAndTreasure(int[][] grid) {
          int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});

                }
            }
        }
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {0, 0}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int i = 0; i < dirs.length; i++) {
                int x = curr[0] + dirs[i][0];
                int y = curr[1] + dirs[i][1];
                if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == Integer.MAX_VALUE) {
                    grid[x][y] = grid[curr[0]][curr[1]] + 1;
                    queue.offer(new int[]{x, y});
                }

            }


        }


    
        
    }
}
