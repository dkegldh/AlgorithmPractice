// https://school.programmers.co.kr/learn/courses/30/lessons/12980 Lv.2
package October.Oct19;

import java.util.*;

public class num12980 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 5;
    int result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int n) {
    int ans = 1;

    while (n != 1) {
      if(n / 2 != 0) {
        ans += n % 2;
      }
      n /= 2;
    }

    return ans;
  }
}