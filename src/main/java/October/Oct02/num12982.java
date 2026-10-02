// https://school.programmers.co.kr/learn/courses/30/lessons/12982
package October.Oct02;

import java.util.Arrays;

public class num12982 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] d = {1, 3, 2, 4, 5};
    int budget = 9;
    int result = sol.solution(d, budget);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] d, int budget) {
    int answer = 0;
    Arrays.sort(d);

    for (int i = 0; i < d.length; i++) {
      if(d[i] <= budget) {
        budget -= d[i];
        answer++;
      }
    }

    return answer;
  }
}