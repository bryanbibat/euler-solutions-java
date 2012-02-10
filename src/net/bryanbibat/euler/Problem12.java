package net.bryanbibat.euler;

public class Problem12 {
  
  public void solve(int limit) {
    long num = 1;
    long iter = 1;
    while(true) {
      iter++;
      num += iter;
      if (getDivisors(num) > limit) {
        System.out.println(num);
        break;
      }
    }
  }

  private int getDivisors(long num) {
    int divisors = 2; 
    long limit = (long) Math.sqrt(num * 1.0);
    for (int cur = 2; cur < limit; cur++) {
      if (num % cur == 0) {
        divisors += 2;
      }
    }
    if (num % limit == 0) {
      divisors++;
    }
    return divisors;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem12 prog = new Problem12();
    prog.solve(5);
    prog.solve(500);
  }

}
