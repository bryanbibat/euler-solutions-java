package net.bryanbibat.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {
  
  public static void solve(int limit) {
    //generate primes
    List<Long> primes = new ArrayList<Long>();
    primes.add(2l);
    long sum = 2;
    long current = 3;
    while (current < limit) {
      boolean isPrime = true;
      long factorLimit = (long) Math.sqrt(current);
      for (Long prime : primes) {
        if (current % prime == 0) {
          isPrime = false;
          break;
        }
        if (prime > factorLimit) {
          break;
        }
      }
      if (isPrime) {
        primes.add(current);
        sum += current;
      }
      current += 2;
    }
    System.out.println(sum);
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    solve(10);
    solve(2000000);
  }

}
