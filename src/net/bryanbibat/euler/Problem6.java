package net.bryanbibat.euler;

public class Problem6 {

  public void solve(int end) {
    System.out.println(squareOfSums(end) - sumOfSquares(end));
  }
  
  
  private long sumOfSquares(int end) {
    long solution = 0;
    for (int i = 1; i <= end; i++) {
      solution += i * i;
    }
    return solution;
  }


  private long squareOfSums(int end) {
    long solution = 0;
    for (int i = 1; i <= end; i++) {
      solution += i;
    }
    return solution * solution;
  }


  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem6 prog = new Problem6();
    prog.solve(10);
    prog.solve(100);
  }

}
