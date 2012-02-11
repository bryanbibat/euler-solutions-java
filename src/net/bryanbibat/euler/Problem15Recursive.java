package net.bryanbibat.euler;

public class Problem15Recursive {
  
  long paths;
  int maxX;
  int maxY;
  
  public Problem15Recursive(int x, int y) {
    paths = 0;
    maxX = x;
    maxY = y;
    search(0, 0);
  }
  
  public long getPaths() {
    return paths;
  }

  private void search(int x, int y) {
    if (x == maxX && y == maxY) {
      paths++;
      if (paths % 1000000000l == 0) {
        System.out.println(paths);
      }
      return;
    }
    if (x < maxX) {
      search(x + 1, y);
    }
    if (y < maxY) {
      search(x, y + 1);
    }
  }
  

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem15Recursive prog = new Problem15Recursive(2, 2);
    System.out.println(prog.getPaths());
    prog = new Problem15Recursive(20, 20);
    System.out.println(prog.getPaths());
  }

}
