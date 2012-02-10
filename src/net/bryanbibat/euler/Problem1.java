package net.bryanbibat.euler;

public class Problem1 {
  
  public void solve(long range) {
    long answer = 0;
    for (int current = 1; current < range; current++) {
      if (current % 3 == 0 || current % 5 == 0) {
        answer += current;
      }
    }
    System.out.println(answer);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem1 prog = new Problem1();
    prog.solve(10); // output 23
    prog.solve(1000); // output ???
  }

}
