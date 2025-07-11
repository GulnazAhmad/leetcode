class Solution {
    public boolean allElementsAreTwoorzero(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int min = 0;

        while (true) {
            int[][] copy = new int[r][c];
            boolean rottedThisMinute = false;

            // Copy grid to avoid same-minute rotting effect
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    copy[i][j] = grid[i][j];
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (grid[i][j] == 2) {
                        if (i + 1 < r && grid[i + 1][j] == 1) {
                            copy[i + 1][j] = 2;
                            rottedThisMinute = true;
                        }
                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            copy[i - 1][j] = 2;
                            rottedThisMinute = true;
                        }
                        if (j + 1 < c && grid[i][j + 1] == 1) {
                            copy[i][j + 1] = 2;
                            rottedThisMinute = true;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            copy[i][j - 1] = 2;
                            rottedThisMinute = true;
                        }
                    }
                }
            }

            // Copy back changes
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    grid[i][j] = copy[i][j];
                }
            }

            if (rottedThisMinute) {
                min++;
            } else {
                break; // no more oranges rotted — stop the loop
            }
        }

        return allElementsAreTwoorzero(grid) ? min : -1;
    }
}
