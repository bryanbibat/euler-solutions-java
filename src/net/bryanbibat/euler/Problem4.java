package net.bryanbibat.euler;

public class Problem4 {
  
  public void largestPalindrome(int start, int end) {
    int palindrome = 0;
    for (int x = start; x < end; x++) {
      for (int y = start; y < end; y++) {
        int value = x * y; 
        if (isPalindrome(value) && value > palindrome) {
          palindrome = value;
        }
      }
    }
    System.out.println(palindrome);
  }
  
  private boolean isPalindrome(int num) {
    StringBuffer sb = new StringBuffer(Integer.toString(num));
    return Integer.toString(num).equalsIgnoreCase(sb.reverse().toString());
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    Problem4 prog = new Problem4();
    prog.largestPalindrome(10, 100);
    prog.largestPalindrome(100, 1000);
  }

}
