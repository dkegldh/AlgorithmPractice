package May31;

import java.util.Arrays;
import java.util.Collections;

public class num12932 {

  public static void main(String[] args) {
    long n = 124467;
    Solution sol = new Solution();
    int[] result = sol.solution(n);
    System.out.println(Arrays.toString(result));
  }

}

class Solution {
  public int[] solution(long n) {
    String num = String.valueOf(n);
    int[] answer = new int[num.length()];
    String[] a = new String[num.length()];
    int m = 0;
    for (int i = a.length - 1; i >= 0; i--) {
      a[i] = String.valueOf(num.charAt(m));
      m++;
    }

    for (int i = 0; i < a.length; i++) {
      answer[i] = Integer.parseInt(a[i]);
    }
    return answer;
  }
}