package net.bryanbibat.euler;

import java.util.List;
import java.util.ArrayList;

public class Problem3 {

  public void highestFactor(long num) {
    List<Long> primes = new ArrayList<Long>();
    long working = num;
    long current = 2;
    while (working != 1) {
      boolean isPrime = true;
      for (Long prime : primes) {
        if (current % prime == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primes.add(current);
        if (working % current == 0) {
          working /= current;
        }
      }
      current++;
    }
    System.out.println(primes.get(primes.size() - 1));
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem3 prog = new Problem3();
    prog.highestFactor(13195);
    prog.highestFactor(600851475143l);

  }

}
