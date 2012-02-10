package net.bryanbibat.euler;

public class Problem9 {
  public static void solve() {
    for (int a = 1; a < 999; a++) {
      for (int b = 1; b <= a; b++) {
        int c = 1000 - a - b;
        if (c * c == a * a + b * b) {
          System.out.println(a * b * c);
          return;
        }
      }
    }
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    solve();
  }

}
