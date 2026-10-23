// https://school.programmers.co.kr/learn/courses/30/lessons/87390 Lv.2
package October.Oct23;

import java.util.Arrays;

public class num87390 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 4;
    long left = 7;
    long right = 14;
    int[] result = sol.solution(n, left, right);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int n, long left, long right) {
    int[] answer = new int[(int) (right - left + 1)];

    for (int i = 0; i < (int) (right - left + 1); i++) {
      long k = left + i;
      answer[i] = Math.max((int) (k / n), (int) (k % n)) + 1;
    }

    return answer;
  }
}