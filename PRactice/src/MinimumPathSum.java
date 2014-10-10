public class MinimumPathSum {
	public static void main(String[] args) {
		MinimumPathSum m = new MinimumPathSum();
		int[][] grid = { { 2, 4 }, { 3, 5 }, { 9, 4 } };
		System.out.println("The minimum sum is: " + m.minPathSum(grid));
	}

	public int minPathSum(int[][] grid) {
		int sum = 0;
		int colmax = grid[0].length;
		int rowmax = grid.length;
		System.out.println("rowMax: " + rowmax);
		System.out.println("colmax: " + colmax);
		return traverse(0, 0, grid, sum, rowmax, colmax);
	}

	public int traverse(int m, int n, int[][] grid, int sum, int row, int col) {
		sum = sum + grid[m][n];
		System.out.println("inside the traverse loop: sum :" + sum
				+ " Grid value: " + grid[m][n]);
		if (m + 1 < row) {
			traverse(m + 1, n, grid, sum, row, col);
		}
		if (n + 1 < col) {
			traverse(m, n + 1, grid, sum, row, col);
		}
		System.out.println(sum);
		return sum;
	}
}
