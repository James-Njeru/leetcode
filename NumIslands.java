public int numIslands(char[][] grid) {
		int count = 0;
		int row = grid.length;
		int col = grid[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, i, j, row, col);;
				}
			}
		}
		return count;
	}


	private void dfs(char[][] grid, int i, int j, int row, int col) {
		//cases to avoid index out of bound
		if (i<0 || i>=row || j<0 || j>=col || grid[i][j]=='0') {
			return;
		}
		//change 1's we've counted to 0
		grid[i][j] = '0';
		
		dfs(grid, i+1, j, row, col);
		dfs(grid, i-1, j, row, col);
		dfs(grid, i, j+1, row, col);
		dfs(grid, i, j-1, row, col);
	}
