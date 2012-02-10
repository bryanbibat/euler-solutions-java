package net.bryanbibat.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
  
  public void getPrime(int n) {
    //generate primes
    List<Long> primes = new ArrayList<Long>();
    primes.add(2l);
    long current = 3;
    while (primes.size() < n) {
      boolean isPrime = true;
      for (Long prime : primes) {
        if (current % prime == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primes.add(current);
      }
      current += 2;
    }
    System.out.println(primes.get(primes.size() - 1));
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem7 prog = new Problem7();
    prog.getPrime(6);
    prog.getPrime(10001);

  }

}
