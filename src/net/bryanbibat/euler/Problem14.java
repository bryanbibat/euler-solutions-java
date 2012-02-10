package net.bryanbibat.euler;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem14 {
  
  private long longestChainLength;
  private long longestChainStart;
  private long limit;
  
  private Map<Long, Long> chainLengths;
  
  public Problem14(long limit) {
    longestChainLength = 1;
    longestChainStart = 1;
    this.limit = limit;
    chainLengths = new HashMap<Long, Long>();
    chainLengths.put(1l, 1l);
    for (long current = 2; current < limit; current++) {
      calculateChain(current);
    }
  }
  
  private void calculateChain(long current) {
    if (chainLengths.containsKey(current)) {
      return;
    }
    Stack<Long> working = new Stack<Long>();
    working.push(current);
    while (!chainLengths.containsKey(working.peek())) {
      if (working.peek() % 2 == 0) {
        working.add(working.peek() / 2);
      } else {
        working.add(3 * working.peek() + 1);
      }
    }
    long length = chainLengths.get(working.pop()) + 1;
    while (!working.isEmpty()) {
      long top = working.pop();
      chainLengths.put(top, length);
      if (top < limit && longestChainLength < length) {
        longestChainLength = length;
        longestChainStart = top;
      }
      length++;
    }
  }
  
  public void solve() {
    System.out.println(longestChainStart);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem14 prog = new Problem14(1000000);
    prog.solve();
  }

}
