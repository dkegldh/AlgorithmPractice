// https://school.programmers.co.kr/learn/courses/30/lessons/12940
package October.Oct04;

import java.util.Arrays;

public class num12940 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 4;
    int m = 6;
    int[] result = sol.solution(n, m);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int n, int m) {
    int[] answer = new int[2];

    if(n < m) {
      for (int i = 1; i <= n; i++) {
        if(n % i == 0 && m % i == 0) {
          answer[0] = i;
        }
      }
    } else {
      for (int j = 1; j <= m; j++) {
        if(m % j == 0 && n % j == 0) {
          answer[0] = j;
        }
      }
    }

    answer[1] = n * m / answer[0];

    return answer;
  }
}