package net.bryanbibat.euler;

public class Problem15 {

  public static long solve(int x, int y) {
    long[][] grid = new long[x + 1][y + 1];
    grid[0][0] = 1;
    for (int col = 1; col < x; col++) {
      for (int row = col; row >= 0; row--) {
        int curCol = col - row;
        grid[row][curCol] = 
            (row > 0 ? grid[row - 1][curCol] : 0) +
            (curCol > 0 ? grid[row][curCol - 1] : 0);
      }
    }
    for (int row = 0; row <= x; row++) {
      for (int col = y, curRow = row; col >= row; col--, curRow++) {
        grid[curRow][col] = 
            (curRow > 0 ? grid[curRow - 1][col] : 0) +
            (col > 0 ? grid[curRow][col - 1] : 0);
      }
    }
    return grid[x][y];
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(solve(2,2));
    System.out.println(solve(20,20));
  }
}
