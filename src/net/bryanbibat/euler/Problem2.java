package net.bryanbibat.euler;

public class Problem2 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    long prev = 2;
    long current = 3;
    long next = 5;
    long answer = 2;
    do {
      prev = current;
      current = next;
      next = current + prev;
      if (current % 2 == 0) { 
        answer += current;
      }
    } while(next < 4000000);
    System.out.println(answer);
  }

}
