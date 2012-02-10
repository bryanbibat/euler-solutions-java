package net.bryanbibat.euler;

public class Problem5 {
  
  public void largestEvenlyDivisible(int end) {
    boolean finished = false;
    for (int num = 6; !finished; num += 6) {
      boolean evenlyDivisible = true;
      for (int divisor = 4; divisor <= end; divisor++) {
        if (num % divisor != 0) {
          evenlyDivisible = false;
        }
      }
      if (evenlyDivisible) {
        System.out.println(num);
        finished = true;
      }
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem5 prog = new Problem5();
    prog.largestEvenlyDivisible(10);
    prog.largestEvenlyDivisible(20);

  }

}
