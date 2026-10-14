// https://school.programmers.co.kr/learn/courses/30/lessons/138476 Lv.2
package October.Oct14;

import java.util.Arrays;

public class num138476 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int k = 6;
    int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
    int result = sol.solution(k, tangerine);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int k, int[] tangerine) {
    int answer = 0;
    int maxSize = Arrays.stream(tangerine).max().getAsInt();
    int[] count = new int[maxSize + 1];

    for (int num : tangerine) {
      count[num]++;
    }
    Arrays.sort(count);

    for (int i = count.length - 1; i >= 0; i--) {
      int num = count[i];
      if(k - num > 0) {
        answer++;
        k -= num;
      } else {
        answer++;
        break;
      }
    }

    return answer;
  }
}